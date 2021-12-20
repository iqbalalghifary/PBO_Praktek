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
interface Sorting<T extends Comparable<T>> {
    void sort(T[] List);
}
