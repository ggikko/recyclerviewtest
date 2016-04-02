package ggikko.me.recyclerviewtest.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ggikko.me.recyclerviewtest.R;

/**
 * Created by ggikko on 16. 4. 2..
 */
public class GgikkoAdapter extends RecyclerView.Adapter<GgikkoAdapter.GgikkoViewHolder> {

    private List<Write> writingList;

    /** view holder */
    public class GgikkoViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.title) TextView title;
        @Bind(R.id.subtitle) TextView subTitle;
        @Bind(R.id.writer) TextView writer;

        public GgikkoViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    /** constructor & setter for List */
    public GgikkoAdapter(List<Write> writingList) {
        this.writingList = writingList;
    }

    @Override
    public GgikkoAdapter.GgikkoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row, parent, false);
        return new GgikkoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GgikkoViewHolder holder, int position) {
        Write write = writingList.get(position);
        holder.title.setText(write.getTitle());
        holder.subTitle.setText(write.getSubTitle());
        holder.writer.setText(write.getWriter());
    }

    @Override
    public int getItemCount() {
        return writingList.size();
    }
}
