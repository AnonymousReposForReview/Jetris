package tests.javafuzzer815;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 10:21:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=5307327630328033586L;
    public int iFld=9899;
    public static short sFld=-26455;
    public static int iFld1=-9;

    public static long iMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(long l, long l1, int i10) {

        float f1=-19.465F;
        int iArr1[][]=new int[N][N];

        FuzzerUtils.init(iArr1, 20);

        iArr1[(1 >>> 1) % N] = iArr1[(i10 >>> 1) % N];
        f1 *= i10;
        vMeth_check_sum += l + l1 + i10 + Float.floatToIntBits(f1) + FuzzerUtils.checkSum(iArr1);
    }

    public static float fMeth(int i6, int i7) {

        int i8=-133, i9=42, i11=6, i12=-229, i13=-16310, iArr[]=new int[N];
        boolean b=false;
        byte by=78;

        FuzzerUtils.init(iArr, -11);

        for (i8 = 10; i8 < 257; ++i8) {
            try {
                iArr[i8] = (143 / i7);
                i7 = (i6 / i6);
                i9 = (48436 / i7);
            } catch (ArithmeticException a_e) {}
            vMeth(16956L, Test.instanceCount, -59213);
            for (i11 = 1; i11 < 7; ++i11) {
                i7 -= (int)Test.instanceCount;
                i7 += i11;
                i13 = 1;
                do {
                    if (b) break;
                    i6 -= (int)1921149935L;
                    Test.instanceCount = by;
                    if (true) {
                        i9 += (i13 ^ i7);
                    } else {
                        i9 %= (int)(i11 | 1);
                        try {
                            i12 = (i6 / i11);
                            i12 = (i11 % i12);
                            i9 = (i12 / -64090);
                        } catch (ArithmeticException a_e) {}
                        i6 = (int)Test.instanceCount;
                    }
                } while (++i13 < 2);
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + i11 + i12 + i13 + (b ? 1 : 0) + by + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth(int i, int i1) {

        int i2=84, i3=240, i4=12203, i5=-9, i14=5, i15=-18408, i16=-11, iArr2[]=new int[N];
        float f=0.762F;
        double d=-60.120967;
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(lArr, -4443833801293600056L);
        FuzzerUtils.init(byArr, (byte)107);
        FuzzerUtils.init(iArr2, -13);

        for (i2 = 18; i2 < 379; ++i2) {
            for (i4 = i2; i4 < 5; ++i4) {
                f = fMeth(i3, i3);
                lArr[i4] = Test.sFld;
                for (i14 = 1; 1 > i14; ++i14) {
                    i += (int)f;
                    Test.iFld1 += (i14 * i14);
                    byArr[i4] = (byte)i15;
                    i3 = i5;
                    iArr2[i14 - 1] >>= -154;
                }
                f = 4876;
                for (d = 1; d < 1; d += 3) {
                    i1 ^= (int)Test.instanceCount;
                    i16 -= i14;
                    i5 += (int)(d * f);
                }
            }
        }
        long meth_res = i + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i14 + i15 + Double.doubleToLongBits(d) +
            i16 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)22092);

        sArr[(iFld >>> 1) % N] = (short)(iMeth(Test.iFld1, iFld) - Test.iFld1);



    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth mainTest
//DEBUG  vMeth ->  vMeth fMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
