package io.dwak.kotlinsample.ui;

import android.support.v7.util.DiffUtil.Callback;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import io.dwak.adaptergenerator.annotation.AdapterGenerator;
import io.dwak.adaptergenerator.annotation.BindViewHolder;
import io.dwak.adaptergenerator.annotation.DiffCallback;
import io.dwak.kotlinsample.R;
import io.dwak.kotlinsample.data.Note;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@AdapterGenerator(layoutResId = R.layout.vh_note_item, model = Note.class)
public final class NoteItemViewHolder extends ViewHolder {
    private final TextView title;
    private final TextView contents;

    public NoteItemViewHolder(@NotNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        contents = itemView.findViewById(R.id.contents);
    }

    @BindViewHolder
    public final void bind(@NotNull Note note) {
        this.title.setText(note.getTitle());
        this.contents.setText(note.getContents());
    }

    @DiffCallback
    public static final class NoteDiff extends Callback {
        @NotNull private final List oldList;
        @NotNull private final List newList;

        public NoteDiff(@NotNull List oldList, @NotNull List newList) {
            this.oldList = oldList;
            this.newList = newList;
        }

        public boolean areItemsTheSame(int p0, int p1) {
            return ((Note) this.oldList.get(p0)).getId() == ((Note) this.newList.get(p1)).getId();
        }

        public int getOldListSize() {
            return this.oldList.size();
        }

        public int getNewListSize() {
            return this.newList.size();
        }

        public boolean areContentsTheSame(int p0, int p1) {
            return this.oldList.get(p0).equals(this.newList.get(p1));
        }

        @NotNull
        public final List getOldList() {
            return this.oldList;
        }

        @NotNull
        public final List getNewList() {
            return this.newList;
        }

    }
}
