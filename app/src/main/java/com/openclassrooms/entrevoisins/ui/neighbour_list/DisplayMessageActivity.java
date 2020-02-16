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

private Neighbour neighbour;
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
    @BindView (R.id.imageView)
    public ImageView mIcon1;
    @BindView (R.id.imageView3)
    public ImageView mIcon2;
    @BindView (R.id.imageView4)
    public ImageView mIcon3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_display_message);
        Intent intent =getIntent();
        if (intent.getExtras() !=null) {
                neighbour = (Neighbour)intent.getExtras().get("toto");
        }
        ImageView imageView  = findViewById (R.id.item_list_avatar);
        TextView textView = findViewById (R.id.item_list_name2); textView.setText(neighbour.getName());
        TextView textView2 = findViewById (R.id.item_list_name); textView2.setText(neighbour.getName());
        TextView textView3 = findViewById (R.id.item_Description); textView3.setText(neighbour.getDescription());
        TextView textView4 = findViewById (R.id.item_adress); textView4.setText(neighbour.getAdress());
        TextView textView5 = findViewById (R.id.item_facebook); textView5.setText(neighbour.getWebsite());
        TextView textView6 = findViewById (R.id.item_number); textView6.setText(neighbour.getNumber());
        Glide.with(this)
                .load(neighbour.getAvatarUrl())
                .centerCrop()
                .into(imageView);
    }

}
