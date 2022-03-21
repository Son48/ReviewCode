package com.example.transferapplication.activity_activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.transferapplication.R;
import com.example.transferapplication.my_interface.IClickItemUserListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewData;
    private UserAdapter userAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewData=findViewById(R.id.rcvData);
        userAdapter=new UserAdapter(getListUser(), new IClickItemUserListener() {
            @Override
            public void onClickItemUser(User user) {
                onClickGoToDetail(user);
            }
        });
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerViewData.setLayoutManager(linearLayoutManager);
        recyclerViewData.setAdapter(userAdapter);



    }


    private List<User> getListUser() {
        List<User> userList=new ArrayList<>();
        userList.add(new User(R.mipmap.ic_launcher,"User1","Hoa Xuan,Da Nang"));
        userList.add(new User(R.mipmap.ic_launcher,"User2","Hoa Xuan,Da Nang"));
        userList.add(new User(R.mipmap.ic_launcher,"User3","Hoa Xuan,Da Nang"));
        userList.add(new User(R.mipmap.ic_launcher,"User4","Hoa Xuan,Da Nang"));
        userList.add(new User(R.mipmap.ic_launcher,"User5","Hoa Xuan,Da Nang"));

        return userList;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private void onClickGoToDetail(User user){
        Intent intent=new Intent(this, DetailActivity.class);
        Bundle bundle=new Bundle();
        bundle.putParcelable("object_user",user);
        intent.putExtras(bundle);
        startActivity(intent);

    }
}