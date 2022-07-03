package nativealgoritm.searching.binarysearch;

import java.lang.reflect.Field;

public class BigArray {

    public static sun.misc.Unsafe getUnsafe() {
        try {
            Field f = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            return (sun.misc.Unsafe) f.get(null);
        } catch (Exception e) {
            System.err.println("Error obtaining unsafe: " + e.getMessage());
            return null;
        }
    }

    public static class BigIntArray {

        private long address;

        private final static int INT_BYTE_SIZE = 4;

        public BigIntArray(long size) {
            address = getUnsafe().allocateMemory(size * INT_BYTE_SIZE);
        }

        public void set(long idx, int val) {
            getUnsafe().putInt(address + idx * INT_BYTE_SIZE, val);
        }

        public int get(long idx) {
            return getUnsafe().getInt(address + idx * INT_BYTE_SIZE);
        }

        public void free() {
            getUnsafe().freeMemory(address);
        }
    }

    public static void main(String[] args) {

        long size = ((long) Integer.MAX_VALUE) + 10;

        BigIntArray bigArray = new BigIntArray(size);
        bigArray.set(size - 1, 1337);

        System.out.println(bigArray.get(size - 1));

        bigArray.free();
    }
}