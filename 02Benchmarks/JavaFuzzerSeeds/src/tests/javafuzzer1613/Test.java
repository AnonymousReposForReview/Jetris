package tests.javafuzzer1613;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 00:11:29 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=5L;
    public static float fFld=-2.86F;
    public static int iFld=20;
    public static short sFld=-17585;
    public static volatile byte byArrFld[]=new byte[N];
    public static byte byArrFld1[][]=new byte[N][N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)109);
        FuzzerUtils.init(Test.byArrFld1, (byte)-34);
        FuzzerUtils.init(Test.iArrFld, 88);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        byte by1=-97;
        float f=-1.750F;
        int i8=30598, i9=206, i10=0, iArr1[]=new int[N];
        double d1=-87.73473;
        boolean b1=false;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -443730683L);
        FuzzerUtils.init(iArr1, 9);

        lArr[(-8 >>> 1) % N] >>>= Test.iFld;
        Test.iFld -= by1;
        for (f = 14; f < 344; f += 3) {
            try {
                Test.iFld = (-231 % Test.iFld);
                Test.iFld = (-30 / Test.iFld);
                Test.iFld = (i8 % 60);
            } catch (ArithmeticException a_e) {}
            i8 += (int)((long)f | Test.iFld);
            for (i9 = (int)(f); i9 < 14; ++i9) {
                Test.instanceCount = Test.iFld;
                Test.fFld += (((i9 * i10) + Test.iFld) - i8);
                Test.sFld += (short)Test.instanceCount;
                iArr1[(int)(f)] &= i10;
            }
            i10 -= (int)Test.instanceCount;
            Test.sFld = (short)i9;
            d1 -= Test.iFld;
            if (b1) break;
            d1 -= i9;
        }
        vMeth1_check_sum += by1 + Float.floatToIntBits(f) + i8 + i9 + i10 + Double.doubleToLongBits(d1) + (b1 ? 1 : 0)
            + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth(long l) {

        int i3=3, i4=-246, i5=60458, i6=11949, i7=-65, iArr[]=new int[N];
        long l1=5L;
        double d2=-111.91830;

        FuzzerUtils.init(iArr, 18267);

        for (i3 = 5; i3 < 291; ++i3) {
            for (l1 = 1; l1 < 6; ++l1) {
                iArr[(int)(l1)] /= (int)(((long)(i5 % ((long)(Test.fFld) | 1))) | 1);
                for (i6 = i3; i6 < 2; i6++) {
                    i5 += i6;
                    i7 += (((i6 * i6) + i3) - Test.sFld);
                    try {
                        i5 = (1817236750 / i5);
                        Test.iFld = (i6 % iArr[i6]);
                        iArr[(int)(l1 + 1)] = (i7 / -93);
                    } catch (ArithmeticException a_e) {}
                    if (false) {
                        vMeth1();
                    }
                    l += (i6 * l);
                    d2 -= Test.fFld;
                    Test.iFld = i5;
                    Test.byArrFld[i6 - 1] %= (byte)(l | 1);
                }
                Test.iFld += (int)Test.instanceCount;
                Test.byArrFld1[i3][(int)(l1)] = (byte)Test.fFld;
            }
        }
        vMeth_check_sum += l + i3 + i4 + l1 + i5 + i6 + i7 + Double.doubleToLongBits(d2) + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth(int i1, double d) {

        int i2=137, i11=-83, i12=201;
        boolean b2=true, bArr[]=new boolean[N];

        FuzzerUtils.init(bArr, true);

        i2 = 1;
        do {
            vMeth(Test.instanceCount);
            for (i11 = i2; i11 < 11; i11++) {
                Test.instanceCount = i12;
                Test.instanceCount += i11;
                if (b2) continue;
                bArr[i11] = b2;
                Test.instanceCount = -169;
                i1 -= i12;
            }
            bArr[i2 - 1] = b2;
            i1 *= Test.sFld;
            if (b2) {
                Test.instanceCount <<= i2;
            }
        } while (++i2 < 141);
        Test.instanceCount = i2;
        Test.iFld += i2;
        long meth_res = i1 + Double.doubleToLongBits(d) + i2 + i11 + i12 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(bArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        byte by=76;
        boolean b=true;
        int i=-144, i13=-87, i14=9, i15=3, i16=1, i17=-80, i18=9, i19=183, i20=-15740;
        double d4=0.29620;
        float f1=-1.98F, fArr[]=new float[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-16926);
        FuzzerUtils.init(fArr, -51.42F);

        Test.fFld = (-by);
        b = ((Test.iFld++) >= Test.iFld);
        i = 1;
        do {
            double d3=1.130966;
            Test.iFld = iMeth(57644, d3);
        } while (++i < 162);
        sArr[(6 >>> 1) % N] -= (short)Test.instanceCount;
        for (i13 = 4; i13 < 158; ++i13) {
            Test.fFld *= i15;
            i15 %= (int)((long)(d4) | 1);
            switch (((i13 % 1) * 5) + 27) {
            case 29:
                f1 += 12603;
                break;
            }
            fArr[i13] = Test.instanceCount;
            i16 = 1;
            do {
                Test.instanceCount *= 212;
                if (b) break;
                i14 *= Test.sFld;
            } while ((i16 += 2) < 163);
            for (i17 = 3; i17 < 163; i17++) {
                by = (byte)i18;
                b = b;
                for (i19 = 1; i19 < 2; i19++) {
                    Test.iArrFld[i13] -= (int)Test.instanceCount;
                    by += (byte)(i19 * i19);
                }
                Test.iArrFld = FuzzerUtils.int1array(N, (int)-17);
                Test.instanceCount = -14L;
                Test.iFld = (int)Test.instanceCount;
                Test.iFld += i17;
                by += (byte)(i17 - i16);
                Test.instanceCount -= (long)2.851F;
                Test.iArrFld[i17 - 1] = i;
            }
            Test.iFld >>= (int)Test.instanceCount;
            Test.iFld += -4;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
