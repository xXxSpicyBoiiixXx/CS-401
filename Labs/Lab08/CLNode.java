public class CLNode<T> {
    protected CLNode<T> link;
    protected T info;

    public CLNode(T info) {
        this.info = info;
        link = null;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setLink(CLNode<T> link) {
        this.link = link;
    }

    public CLNode<T> getLink() {
        return link;
    }
}