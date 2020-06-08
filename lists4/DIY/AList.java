/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    private int[] L_;
    private int size_;
    /** Creates an empty list. */
    public AList() {
        L_ = new int[10000000];
        size_ = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        L_[size_] = x;
        size_++;
    }

    /** Returns the item from the back of the list. */
    public int getLast()
    {
        return L_[size_ - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i)
    {
        return L_[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size_;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast()
    {
        int last_item = getLast();
        size_--;
        return last_item;
    }
} 