package silva.oliveira.de.maria.daianny.applista01.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import silva.oliveira.de.maria.daianny.applista01.R;
import silva.oliveira.de.maria.daianny.applista01.activity.MainActivity;
import silva.oliveira.de.maria.daianny.applista01.model.MyItem;

public class MyAdapter extends RecyclerView.Adapter {
    MainActivity mainActivity;
    List<MyItem> itens;

    public MyAdapter(MainActivity mainActivity, List<MyItem> itens){
        this.mainActivity = mainActivity;
        this.itens = itens;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mainActivity);
        View view = inflater.inflate(R.layout.itemlist,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyItem myItem = itens.get(position);
        View view = holder.itemView;

        ImageView imvfoto = view.findViewById(R.id.imvPhoto);
        imvfoto.setImageURI(myItem.photo);

        TextView tvTitle = view.findViewById(R.id.tvTitle);
        tvTitle.setText(myItem.title);

        TextView tvdesc = view.findViewById(R.id.tvDesc);
        tvdesc.setText(myItem.description);
    }

    @Override
    public int getItemCount(){
        return itens.size();

    }
}

