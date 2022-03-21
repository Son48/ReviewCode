package com.example.demorxjavaretrofit.present;

import android.content.Context;

import com.example.demorxjavaretrofit.model.PhotoModel;
import com.example.demorxjavaretrofit.network.RestClient;
import com.example.demorxjavaretrofit.service.GetPhotosService;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private Context context;
    private View view;
    public MainActivityPresenterImpl(Context context, View view){
        this.context = context;
        this.view = view;

    }

    //Việc thực hiện gọi data được diễn ra khi gọi hàm invokeData(),
    // kết quả trả về sẽ thể hiện lên UI thông qua interface.
    @Override
    public void invokeData() {
        GetPhotosService service= RestClient.createService(GetPhotosService.class);
        //subscribeOn chỉ định nơi thực hiện tác vụ ở đây là Schedulers.io chạy đa luồng
        service.getPhotos().subscribeOn(Schedulers.io())
                //observeOn chỉ định luồng nhận kết quả trả về
                .observeOn(AndroidSchedulers.mainThread())
                .filter(data->{
                    List<PhotoModel> list=data.getData();
                    // xử lý data trả về là thay thế “Con mèo” -> “Sơn” khi sử dụng RxJava2.
                    for(PhotoModel t:list){
                        if(t.getName().equals("Con mèo")) t.setName("Sơn");
                    }
                    data.setData(list);
                    return true;
                })
                .subscribe(response->{
                   // Log.e("respone",new Gson().toJson(response));
                    view.initAdapter(context,response.getData());
                    view.initRecyclerView();
                },throwable -> {
                    throwable.printStackTrace();
                });
    }
}
