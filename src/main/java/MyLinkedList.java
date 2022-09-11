public class MyLinkedList<T> {
    private Node<T> head;
    private Node node;

    public void add(T item) {
        Node<T> node = new Node<>();
        node.setValue(item);

        if (head == null) {
            head = node;
        } else {
            Node<T> last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(node);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }

        int count = 1;
        Node<T> last = head;
        while (last.getNext() != null) {
            last = last.getNext();
            count++;
        }
        return count;
    }

    public T get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            search = search.getNext();


            if (search == null) {
                throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
            }
        }
        return search.getValue();
    }



    public void clear(int _value) {
        Node head = this.head;
        Node node = this.node;

        while (head != null) {
            if (head.value1 == _value) {

                continue;
            }
            head = head.next1;
        }
    }

}
