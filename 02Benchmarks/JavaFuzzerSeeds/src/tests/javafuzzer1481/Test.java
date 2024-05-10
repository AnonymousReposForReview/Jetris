package tests.javafuzzer1481;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:18:16 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-14679L;
    public volatile int iFld=-63858;
    public static float fFld=-2.131F;
    public volatile int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i4, int i5, int i6) {

        short s=15504;
        int i7=10, i8=-211, i9=38425, i10=-2, iArr1[]=new int[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 32.18190);
        FuzzerUtils.init(iArr1, -27847);

        i4 += 48400;
        s *= (short)i6;
        dArr[(-221 >>> 1) % N] += i6;
        Test.fFld += i4;
        i4 <<= (int)Test.instanceCount;
        for (i7 = 3; i7 < 345; ++i7) {
            i9 = 1;
            do {
                iArr1[i7 + 1] -= (int)Test.instanceCount;
                i10 = 1;
                while (++i10 < 1) {
                    switch (((i5 >>> 1) % 1) + 25) {
                    case 25:
                        i5 <<= i6;
                        break;
                    }
                    iArr1[i10 + 1] = i10;
                    i5 = i6;
                    Test.instanceCount -= i5;
                    if (false) break;
                }
            } while (++i9 < 5);
        }
        vMeth2_check_sum += i4 + i5 + i6 + s + i7 + i8 + i9 + i10 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr))
            + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i1=4, i2=33521, i3=-254, i11=6, i12=180;
        float f1=-58.143F;
        short s1=-22163;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 6404143875795184956L);

        i1 += (int)((i1 - (++i1)) * ((i1++) - (f1 + i1)));
        for (i2 = 4; i2 < 141; i2++) {
            vMeth2(i2, i1, i2);
            i1 *= (int)Test.instanceCount;
            Test.instanceCount = i3;
            i1 += i2;
            switch (((i2 % 2) * 5) + 126) {
            case 131:
                i1 = s1;
                break;
            case 135:
                for (i11 = i2; i11 < 11; ++i11) {
                    lArr[i2] *= i11;
                    i1 -= i11;
                    Test.fFld -= s1;
                    Test.instanceCount += (((i11 * Test.instanceCount) + i11) - f1);
                    Test.fFld -= -220;
                    Test.instanceCount = i12;
                }
                break;
            }
        }
        vMeth1_check_sum += i1 + Float.floatToIntBits(f1) + i2 + i3 + s1 + i11 + i12 + FuzzerUtils.checkSum(lArr);
    }

    public static void vMeth(long l, double d, int i) {

        double d1=-115.125131;
        float f=0.404F;
        int iArr[]=new int[N];

        FuzzerUtils.init(iArr, -4);

        l *= (long)((++d1) * Integer.reverseBytes(i + i));
        i = i;
        f -= (i++);
        i = (int)(i *= (int)(iArr[(i >>> 1) % N] = (int)(f--)));
        vMeth1();
        vMeth_check_sum += l + Double.doubleToLongBits(d) + i + Double.doubleToLongBits(d1) + Float.floatToIntBits(f) +
            FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i13=15477, i14=-235, i15=-63806, i16=-13760, i17=0, i18=-10565, i19=-12, i20=46863;
        byte by=-116;
        boolean b=true;

        iFld -= ((++iFld) ^ iFld);
        vMeth(Test.instanceCount, 0.114503, iFld);
        for (i13 = 11; i13 < 319; ++i13) {
            Test.instanceCount += (((i13 * iFld) + i13) - i14);
            iFld <<= 10921;
            iFld -= by;
            iFld %= (int)((long)(Test.fFld) | 1);
            iFld = (int)Test.instanceCount;
            i14 -= (int)1.64697;
            i14 -= i13;
            iFld = (int)Test.instanceCount;
            Test.instanceCount *= i13;
        }
        for (i15 = 10; i15 < 183; i15++) {
            by += (byte)(((i15 * i16) + Test.fFld) - i14);
            if (b) break;
            for (i17 = 145; i17 > 2; --i17) {
                Test.fFld = i14;
                Test.instanceCount += (long)(19.803F + (i17 * i17));
                Test.instanceCount += (i17 * i17);
                i16 >>= iFld;
                Test.fFld += (((i17 * i15) + Test.fFld) - Test.instanceCount);
                for (i19 = 1; i19 < 2; i19++) {
                    try {
                        iFld = (i16 % i15);
                        i16 = (iFld % -9368);
                        iFld = (iArrFld[i17] / i17);
                    } catch (ArithmeticException a_e) {}
                    if (b) break;
                    b = true;
                    i18 -= -10;
                    Test.fFld += i19;
                    Test.instanceCount <<= by;
                    Test.instanceCount = i18;
                }
                iArrFld[i17 - 1] += (int)2.172F;
            }
        }



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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
