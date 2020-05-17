import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SimpleObservable {
    public static void main(String[] args) {
        Observable<String> observable = Observable.just("First","Second","Third");
        Observer<String> observer = new Observer<String>() {
            public void onSubscribe(Disposable disposable) {

            }

            public void onNext(String s) {
                System.out::println;
            }

            public void onError(Throwable throwable) {:wq

            }

            public void onComplete() {

            }
        }
        //Observable<String> observable = Observable.create()
    }
}
