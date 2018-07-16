package pro.i_it.testproject.utils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import io.reactivex.Flowable;
import io.reactivex.processors.PublishProcessor;

/**
 * Created by syn on 15.07.18.
 */

public class RxTextWatcher {
    public static Flowable getWatcher(EditText editText) {
        PublishProcessor<String> processor = PublishProcessor.create();
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                processor.onNext(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        return processor;
    }
}
