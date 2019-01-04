package naschke.tim.studipfilemaster;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class NavigationAdapter
        extends RecyclerView.Adapter<NavigationAdapter.NavigationViewHolder> {

    private String[] mDataset;

    public static class NavigationViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public NavigationViewHolder(TextView textView) {
            super(textView);
            mTextView = textView;
        }
    }

    public NavigationAdapter(String[] dataset) {
        mDataset = dataset;
    }

    @NonNull
    public NavigationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textView = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.viewholder_navigation, parent, false);

        return new NavigationViewHolder(textView);
    }

    public void onBindViewHolder(@NonNull NavigationViewHolder viewHolder, int position) {
        viewHolder.mTextView.setText(mDataset[position]);
    }

    public int getItemCount() {
        return mDataset.length;
    }
}
