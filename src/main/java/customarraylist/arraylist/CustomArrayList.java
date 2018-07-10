package customarraylist.arraylist;

import java.util.Arrays;
import java.util.Collection;

public class CustomArrayList {
    private Object[] members; // наши объекты
    private int currentSize = 0; // реальный размер в памяти


    // #################################################################################

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "members=" + Arrays.toString(members) +
                '}';
    }

    private int size = 0; // размер для пользователя

    public CustomArrayList() {
        this.members = new Object[5];
        this.currentSize = 5;

        this.size = 0;
    }

    public int size(){
        return this.size;
    };

    public boolean isEmpty(){
        if (this.size == 0) {
            return true;
        }  else {
            return false;
        }
    }

    public boolean contains(Object o){
        for (int i = 0; i < this.size; i++) {
            if ((o != null)&&(this.members[i]!=null)&&this.members[i].equals(o)) {
                return true;
            }
        }

        return false;
    }

    public Object[] toArray()
    {
        Object[] result;
        result = Arrays.copyOfRange(members,0,size);
        return result;
    }

    public boolean add(Object o) {
        if (this.currentSize == this.size) {
            increaseSize();
            this.members[this.size] = o;
            this.size = this.size+1;

        } else {

            this.members[this.size] = o;
            this.size = this.size+1;


        }

        return true;
    }

    public void remove(Object o) {
        int count = 0;
        Object[] result = new Object[this.size];

        for (int i = 0; i < this.size; i++) {

            if ((this.members[i]!=null)&&(this.members[i].equals(o))) {


            }else {
                result[count] = this.members[i];
                count++;
            }
        }
        Object[] result2 = new Object[count];
        System.arraycopy(result, 0, result2, 0, count);
        this.members = result2;
        this.size = count;
        this.currentSize = count;

    }

    public boolean containsAll(Collection<?> c) {
        for (Object o:c) {
            if (!(this.contains(o))){
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<?> c) {
        for (Object o:c) {
            if (o != null){
                this.add(o);
            }
        }
        return true;

    }

    public boolean removeAll(Collection<?> c) {
        for (Object o:c) {
            if (o != null){
                this.remove(o);
            }
        }
        return true;

    }

    public boolean retainAll(Collection<?> c) {
        Object[] tmp = new Object[size];
        int count = 0;

        for (int i = 0; i < this.size; i++) {
            if (!(c.contains(this.members[i]))){
                tmp[count] = this.members[i];
                count++;
            }
        }

        for (int i = 0; i < count ; i++) {
            this.remove(tmp[i]);

        }

        return true;

    }

    public void clear(){
        this.members = new Object[5];
        this.currentSize = 5;

        this.size = 0;
    }


    public Object get(int i){
        if((i>0)&&(i<=size)) {
            for (int j = 0; j < size; j++) {
                if (((i-1) == j)) {
                    if (this.members[j]!= null) {
                        return this.members[j];
                    }
                }



            }
        }
        return null;
    }

    public Object set(int i, Object o){
        if((i>0)&&(i<=size)) {
            for (int j = 0; j < size; j++) {
                if (((i-1) == j)) {
                    this.members[j] = o;
                    return o;

                }
            }
        }
        return null;
    }

    public void add(int x, Object o) {
        if (this.currentSize == this.size) {
            increaseSize();
        }

        Object[] result = new Object[this.size+1];



        for (int i = 0; i < this.size; i++) {
            if (i<(x-1)) {
                result[i] = this.members[i];
            }

            if (((x-1)==i)) {
                result[i] = o;

            }

            if (i>(x-1)) {
                result[i] = this.members[i-1];
            }

        }

        result[this.size] = this.members[this.size-1];
        this.members = result;
        this.size = this.size + 1;
        this.currentSize = result.length;

    }

    public int indexOf(Object o){
        for (int i = 0; i < this.size; i++) {
            if (this.members[i].equals(o)) return i+1;

        }

        return -1;
    }

    public int lastIndexOf(Object o){
        int result = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.members[i].equals(o)) result = i+1;

        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayList that = (CustomArrayList) o;
        return Arrays.equals(members, that.members);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(members);
    }

    private void increaseSize() {
        Object[] result = new Object[this.currentSize+5];
        System.arraycopy(this.members, 0, result, 0, size);
        this.members = result;
        this.currentSize = this.currentSize + 5;
    }

}
