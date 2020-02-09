package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ViewTarget;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;

public class DisplayMessageActivity extends AppCompatActivity  {


    // UI Components

    @BindView(R.id.item_list_avatar)
    public ImageView mNeighbourAvatar;
    @BindView(R.id.item_list_name2)
    public TextView mNeighbourName2;
    @BindView (R.id.textView2)
    public TextView mNeighbourTextCard;
    @BindView (R.id.item_list_name)
    public TextView mNeighbourName;
    @BindView (R.id.item_Description)
    public TextView mDescriptionText;
    @BindView (R.id.item_adress)
    public TextView mAdressText;
    @BindView (R.id.item_facebook)
    public TextView mFacebookText;
    @BindView (R.id.item_number)
    public TextView mNumberText;
    @BindView (R.id.icon1)
    public ImageView mCallIcon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_display_message);
        Intent intent =getIntent();
        String avatar = intent.getStringExtra(MyNeighbourRecyclerViewAdapter.EXTRA_AVATAR);
        String name = intent.getStringExtra(MyNeighbourRecyclerViewAdapter.EXTRA_NAME);
        String descr = intent.getStringExtra(MyNeighbourRecyclerViewAdapter.EXTRA_DESCR);
        String adress = intent.getStringExtra(MyNeighbourRecyclerViewAdapter.EXTRA_ADRESS);
        String website = intent.getStringExtra (MyNeighbourRecyclerViewAdapter.EXTRA_WEBSITE);
        String number = intent.getStringExtra (MyNeighbourRecyclerViewAdapter.EXTRA_NUMBER);
        ImageView imageView  = findViewById (R.id.item_list_avatar);
        ImageView imageView2 = findViewById (R.id.icon1);
        TextView textView = findViewById (R.id.item_list_name2);
        TextView textView2 = findViewById (R.id.item_list_name);
        TextView textView3 = findViewById (R.id.item_Description);
        TextView textView4 = findViewById (R.id.item_adress);
        TextView textView5 = findViewById (R.id.item_facebook);
        TextView textView6 = findViewById (R.id.item_number);
        textView.setText(name);
        textView2.setText(name);
        textView3.setText(descr);
        textView4.setText(adress);
        textView5.setText(website);
        textView6.setText(number);
        Glide.with(this)
                .load(avatar)
                .centerCrop()
                .into(imageView);

    }

}
