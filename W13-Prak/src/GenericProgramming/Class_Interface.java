/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericProgramming;

/**
 *
 * @author ikbal alghifary
 */
public class Class_Interface<T extends Comparable<T>> implements Sorting<T> {
    T[] vals;
    Class_Interface(T[] o){
        vals = o;
    }
    
    @Override
    public void sort(T[] List){
        for (int index = 1; index < vals.length; index++) {
            T key = vals[index];
            int position = index - 1;
            while (position >= 0 && key.compareTo(vals[position]) > 0) {
                vals[position + 1] = vals[position];
                position--;
            }
            vals[position + 1] = key;
        }
    }
}
