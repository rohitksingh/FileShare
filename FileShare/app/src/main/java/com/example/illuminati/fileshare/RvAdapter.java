package com.example.illuminati.fileshare;

/**
 * Created by Illuminati on 3/17/2017.
 */


        import android.graphics.Bitmap;
        import android.graphics.BitmapFactory;
        import android.media.ThumbnailUtils;
        import android.support.v7.widget.CardView;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;

        import com.example.Model.Media;

        import org.w3c.dom.Text;

        import java.util.List;

/**
 * Created by Illuminati on 2/13/2017.
 */
public class RvAdapter extends RecyclerView.Adapter<RvAdapter.PersonViewHolder> {

    CardView cv;

    List<Media> list;
    Bitmap bitmap;

    public RvAdapter(List<Media> list)
    {
        this.list = list;
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        PersonViewHolder pvh = new PersonViewHolder(view);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
       // holder.personName.setText(list.get(position).getName());
        Media media = list.get(position);
       holder.displayname.setText(media.getName());
        holder.path.setText(media.getPath());


         bitmap = ThumbnailUtils.extractThumbnail(
                BitmapFactory.decodeFile(media.getPath()), 128, 128);

        holder.thumb.setImageBitmap(bitmap);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder{

        TextView path;
        TextView displayname;
        ImageView thumb;

        public PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            path = (TextView)itemView.findViewById(R.id.path);
            displayname =(TextView)itemView.findViewById(R.id.name);
            thumb =(ImageView)itemView.findViewById(R.id.userImage);


        }
    }
}

