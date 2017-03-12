package bussaya.chatsaa.chat.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import bussaya.chatsaa.R;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by admin on 10/3/2560.
 */

public class MessageViewHolder extends RecyclerView.ViewHolder {
public TextView tvMessage;
    public TextView tvName;
    public CircleImageView ivProfile;
    public ImageView ivMessage;

    public MessageViewHolder(View itemView) {
        super(itemView);
        tvMessage = (TextView) itemView.findViewById(R.id.tv_message);
        tvName = (TextView) itemView.findViewById(R.id.tv_name);
        ivProfile = (CircleImageView) itemView.findViewById(R.id.iv_profile);
        ivMessage = (ImageView) itemView.findViewById(R.id.iv_message);
    }
}
