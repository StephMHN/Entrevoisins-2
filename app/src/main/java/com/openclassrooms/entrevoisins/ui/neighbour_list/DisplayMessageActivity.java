package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.List;

import butterknife.BindView;

public class DisplayMessageActivity extends AppCompatActivity {

    private final List<Neighbour> mNeighbours;


    // UI Components

    @BindView(R.id.item_list_avatar)
    public ImageView mNeighbourAvatar;
    @BindView(R.id.item_list_name2)
    public TextView mNeighbourName2;
    @BindView (R.id.textView2)
    public TextView mNeighbourTextCard;
    @BindView (R.id.item_list_name)
    public TextView mNeighbourName;

    public DisplayMessageActivity(List<Neighbour> mNeighbours) {
        this.mNeighbours = mNeighbours;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_display_message);
        Intent intent =getIntent ();
        String avatar = intent.getStringExtra (MyNeighbourRecyclerViewAdapter.EXTRA_AVATAR);
        ImageView imageView = findViewById (R.id.item_list_avatar);
    }

}
