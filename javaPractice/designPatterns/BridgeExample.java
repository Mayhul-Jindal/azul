package javaPractice.designPatterns;

interface Downloader {
    public void download(String url, String path);
}

class WindowsDownloader implements Downloader {
    public void download(String url, String path) {
        System.out.println();
        // Download file on Windows
    }
}

class LinuxDownloader implements Downloader {
    public void download(String url, String path) {
        // Download file on Linux
    }
}

abstract class FileDownloader {
    protected Downloader downloader;

    public FileDownloader(Downloader downloader) {
        this.downloader = downloader;
    }

    public abstract void downloadFile(String url, String path);
}

class SimpleFileDownloader extends FileDownloader{
    public SimpleFileDownloader(Downloader downloader) {
        super(downloader);
    }

    public void downloadFile(String url, String path) {
        downloader.download(url, path);
    }
}


public class BridgeExample {
    public static void main(String[] args) {
        Downloader downloader = new WindowsDownloader();
        FileDownloader fileDownloader = new SimpleFileDownloader(downloader);
        fileDownloader.downloadFile(null, null);
    }
}
