package adapter.sample2;

/**
 * Created by yishengyang on 01/07/2017.
 */
public class PrintBanner extends Print {
    Banner banner;

    public PrintBanner(String str) {
        banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
