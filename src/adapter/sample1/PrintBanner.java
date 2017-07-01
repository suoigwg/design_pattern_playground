package adapter.sample1;

/**
 * Created by yishengyang on 01/07/2017.
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String str) {
        super(str);

    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
