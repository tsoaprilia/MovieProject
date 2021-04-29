package www.smktelkom.sch.id;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    public ArrayList<SearchItem> listMovies = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.movie_adapter, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.bind(listMovies.get(position));
    }

    @Override
    public int getItemCount() {
        return listMovies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.img_poster)
        ImageView img_poster;
        @BindView(R.id.title_view)
        TextView title_view;
        @BindView(R.id.realesed_view)
        TextView realesed_view;
        @BindView(R.id.genre_view)
        TextView genre_view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(SearchItem data) {
            title_view.setText(data.getTitle());
            genre_view.setText(data.getType());
            realesed_view.setText(data.getYear());
            Glide.with(img_poster).load(data.getPoster()).into(img_poster);
        }
    }
}
