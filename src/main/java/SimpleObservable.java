import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleObservable {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("First","Second","Third");
        List<String> lst = Arrays.asList("First","Second","Last");
        Observable<String> observableList = Observable.fromIterable(lst);
        Observer<String> observer = new Observer<String>() {
            public void onSubscribe(Disposable disposable) {
                System.out.println("Subscription is done");
            }

            public void onNext(String s) {
                System.out.println(s);
            }

            public void onError(Throwable throwable) {


            }

            public void onComplete() {
                System.out.println("Completed");
            }
        };
        observable.subscribe(observer);
        System.out.println("----------------From list-----------");
        observableList.subscribe(System.out::println,throwable -> throwable.printStackTrace(),()-> System.out.println("completed"));
        //emitter pending
    }
}
