package modularization.charles.com.modela.book;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import modularization.charles.com.modela.R;
import modularization.charles.com.modela.module.Book;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Book> mBooks = new ArrayList<Book>();
    private final TypedValue mTypedValue = new TypedValue();

    public MyAdapter(BooksFragment booksFragment, Context context) {
        context.getTheme().resolveAttribute(R.attr.selectableItemBackground, mTypedValue, true);
    }

    public void updateItems(List<Book> books) {
        mBooks.addAll(books);
        notifyDataSetChanged();
    }

    public void clearItems() {
        mBooks.clear();
        notifyDataSetChanged();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.module1_book_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Book book = mBooks.get(position);
        holder.tvTitle.setText(book.getTitle());
        holder.tvDesc.setText(book.getAlt());
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }

    public Book getBook(int pos) {
        return mBooks.get(pos);
    }
}
