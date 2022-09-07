public class ByteShortIntLong {
    public static void main (String[] args){
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        //Integer is the wrapper class(present for all 8) by doing this we can perform operations on an int
        System.out.println(myValue);
        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);
        //overflow and underflow happens if we add one or subtract one
        int myIntTest = 1_000_000;
        // Can be saved this way 
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        //byte is the wrapper class(present for all 8) by doing this we can perform operations on an byte
        System.out.println(myValue);
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        long myLongValue = 100L; // USE L after a long value

        //Casting
        byte myByteValue = (byte)
                (myMaxByteValue/2);
        //we can use multiple line java is smart enough to detect that
    }
}
