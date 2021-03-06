package com.parsable.appetizer.parasable.Subscriber;

import com.parsable.appetizer.parasable.ParsableEnum;
import com.parsable.appetizer.parasable.View.ISendDataScreen;

import rx.Subscriber;

/**
 * Created by Davix on 3/11/16.
 */
public class SendTextSubscriber<T> extends Subscriber<T> {

    ISendDataScreen view;
    ParsableEnum.actionName actionName = ParsableEnum.actionName.SendText;

    public SendTextSubscriber(ISendDataScreen view) {
        this.view = view;
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

        if(this.view!=null){
            this.view.displayActionMessage(this.actionName,false);
        }

    }

    @Override
    public void onNext(T t) {

        if(this.view!=null){
            this.view.displayActionMessage(this.actionName,true);
        }

    }

    public void setView(ISendDataScreen view) {
        this.view = view;
    }
}
