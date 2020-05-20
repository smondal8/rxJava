import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class HotObservable {
    public static void main(String[] args) {
        ConnectableObservable<String> connectableObservable = Observable.just("one","two").publish();
        connectableObservable.subscribe(System.out::println,throwable -> throwable.printStackTrace(),()->System.out.println("Completed."));
        connectableObservable.connect();
    }
}
