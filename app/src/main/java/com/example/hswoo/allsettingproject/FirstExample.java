package com.example.hswoo.allsettingproject;

import io.reactivex.Observable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by hswoo on 2017-09-28.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FirstExample {
    public void emit(){
        Observable.just("hello rxjava2")
                .subscribe(System.out::println);
    }
}
