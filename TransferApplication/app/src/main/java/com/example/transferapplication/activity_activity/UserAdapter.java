package com.example.transferapplication.activity_activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.transferapplication.R;
import com.example.transferapplication.my_interface.IClickItemUserListener;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User>userList;
    private IClickItemUserListener iClickItemUserListenerl;
    public UserAdapter(List<User> userList,IClickItemUserListener listener) {
        this.userList = userList;
        this.iClickItemUserListenerl=listener;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user=userList.get(position);
        holder.img.setImageResource(user.getImg());
        holder.name.setText(user.getName());
        holder.address.setText(user.getAdress());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            iClickItemUserListenerl.onClickItemUser(user);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder{
            private ImageView img;
            private TextView name,address;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imgUser);
            name=itemView.findViewById(R.id.tvNameUser);
            address=itemView.findViewById(R.id.tvAdressUser);
        }
    }
}
