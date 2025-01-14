package tests.javafuzzer900;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:25:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=102L;
    public static volatile float fFld=-61.160F;
    public static double dFld=-2.33230;
    public static double dArrFld[]=new double[N];
    public static short sArrFld[]=new short[N];

    static {
        FuzzerUtils.init(Test.dArrFld, -25.15905);
        FuzzerUtils.init(Test.sArrFld, (short)-13015);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(float f) {

        int i8=171, iArr[]=new int[N];

        FuzzerUtils.init(iArr, 234);

        f -= Test.instanceCount;
        iArr[(i8 >>> 1) % N] += (int)Test.instanceCount;
        long meth_res = Float.floatToIntBits(f) + i8 + FuzzerUtils.checkSum(iArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static int iMeth1(int i5, int i6, int i7) {

        double d=0.19523;
        int i9=77, i10=10, i11=-8, i12=2272, i13=3, iArr1[]=new int[N];
        short s=-31995;
        byte by1=-104;

        FuzzerUtils.init(iArr1, 65040);

        i7 = (-(-i7));
        i7 -= (--i7);
        Test.instanceCount = sMeth(Test.fFld);
        i7 = (int)Test.instanceCount;
        Test.instanceCount += (long)d;
        i9 = 1;
        while (++i9 < 354) {
            i6 += (int)Test.fFld;
            for (i10 = 1; 5 > i10; i10++) {
                i6 += (i10 | s);
                for (i12 = 1; i12 < 2; ++i12) {
                    Test.fFld += (((i12 * i6) + i9) - by1);
                    Test.instanceCount = -51516;
                    iArr1[i12] = by1;
                    i5 += (i12 - Test.instanceCount);
                }
                Test.fFld *= i9;
            }
        }
        long meth_res = i5 + i6 + i7 + Double.doubleToLongBits(d) + i9 + i10 + i11 + s + i12 + i13 + by1 +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i4) {

        byte by=78;
        int i14=168, i15=-48797;
        boolean b=false;

        i4 = by;
        Test.instanceCount = ((i4 * Math.max(7116546672654496965L, Test.instanceCount)) + iMeth1(i4, i4, i4));
        Test.instanceCount -= i4;
        i14 = 202;
        do {
            i4 = i15;
            if (b) break;
        } while (--i14 > 0);
        long meth_res = i4 + by + i14 + i15 + (b ? 1 : 0);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-42729, i1=23, i2=39797, i3=-62136, i16=-28299, i17=102, i18=19583;
        long l=15L, lArr[]=new long[N];
        double d1=104.32739;
        boolean b1=false;
        float fArr[]=new float[N];

        FuzzerUtils.init(lArr, 3124165289L);
        FuzzerUtils.init(fArr, -49.968F);

        i = 1;
        do {
            for (i1 = i; i1 < 125; ++i1) {
                i2 = (int)lArr[i + 1];
            }
            for (l = i; l < 125; l += 2) {
                Test.instanceCount += i2;
                i2 += Integer.reverseBytes(iMeth(12955));
            }
            for (i16 = 2; i16 < 125; i16++) {
                short s1=-15841;
                Test.dArrFld[i16 - 1] = l;
                i17 += i16;
                Test.fFld += (-43686 + (i16 * i16));
                i17 = (int)Test.instanceCount;
                i2 += (i16 + l);
                if (false) {
                    Test.sArrFld = Test.sArrFld;
                    s1 += (short)Test.dFld;
                    fArr[i16 + 1] += i;
                    for (d1 = 1; d1 < 2; ++d1) {
                        i2 ^= i1;
                        i2 = (int)Test.instanceCount;
                        if (b1) {
                            Test.fFld += (float)(d1 + i16);
                        } else {
                            i17 *= (int)1.96265;
                            Test.instanceCount += i16;
                        }
                        Test.instanceCount *= (long)Test.fFld;
                        if (b1) continue;
                        i18 %= (int)((long)(Test.fFld) | 1);
                        Test.fFld += (float)d1;
                    }
                }
                b1 = b1;
                lArr[i16] = Test.instanceCount;
                s1 += (short)(i16 * i16);
            }
        } while (++i < 201);

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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  sMeth ->  sMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
