package tests.javafuzzer1867;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 04:57:23 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-131L;
    public short sFld=26843;
    public static double dFld=0.86600;
    public float fFld=-122.538F;
    public static boolean bFld=true;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 7L);
        FuzzerUtils.init(Test.iArrFld, 58506);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(float f, int i9) {

        int i10=-1;
        short s=14429;

        i10 = 1;
        do {
            Test.lArrFld[i10] = i10;
        } while (++i10 < 156);
        s ^= (short)Test.instanceCount;
        long meth_res = Float.floatToIntBits(f) + i9 + i10 + s;
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i6, int i7, int i8) {

        float f1=2.568F;
        int i11=61, i12=-47383, i13=-2, i14=12, i15=10;

        iMeth2(f1, i8);
        i6 = i8;
        for (i11 = 2; i11 < 376; i11++) {
            f1 -= Test.instanceCount;
            i6 -= i12;
            for (i13 = 1; 5 > i13; ++i13) {
                i15 = 1;
                do {
                    i6 -= i15;
                    if (Test.bFld) {
                        f1 = i12;
                    }
                } while (++i15 < 2);
                i14 = i15;
                i8 += i6;
            }
            Test.instanceCount = Test.instanceCount;
        }
        long meth_res = i6 + i7 + i8 + Float.floatToIntBits(f1) + i11 + i12 + i13 + i14 + i15;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth() {

        int i3=224, i4=-1337, i5=-218;

        Test.instanceCount *= i3;
        for (i4 = 24; i4 < 395; i4++) {
            Test.dFld -= i3;
            i3 *= (i3--);
            fFld += (-30090L + (i4 * i4));
            i5 &= Math.abs(iMeth1(i3, 6655, 154));
            i5 >>= i4;
            i3 = i3;
            Test.dFld *= i3;
            i5 -= sFld;
            fFld = i4;
        }
        Test.bFld = Test.bFld;
        i3 >>>= (int)Test.instanceCount;
        Test.iArrFld[(i3 >>> 1) % N] += (int)fFld;
        i3 = -81;
        long meth_res = i3 + i4 + i5;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=63576, i1=-6, i2=6, i16=14, i17=-6, i18=9629, i19=-76, i20=0, i21=-21931, i22=4, i23=-56155, i24=0;
        float f2=-1.772F, fArr[]=new float[N];
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 102.1490);
        FuzzerUtils.init(fArr, -1.73F);

        for (i = 21; i < 351; ++i) {
            dArr[(123 >>> 1) % N] = (i1--);
            Test.instanceCount += i;
            i2 = 1;
            while (++i2 < 76) {
                i1 = (i1++);
                sFld -= (short)(Math.max(--Test.instanceCount, Test.lArrFld[i2 - 1] += i1) * (Integer.reverseBytes(i2)
                    - (-(Test.instanceCount <<= i2))));
                iMeth();
            }
            Test.instanceCount += i;
            i1 = i1;
            for (i16 = 4; i16 < 76; i16++) {
                for (i18 = 1; 2 > i18; ++i18) {
                    i1 = i16;
                    dArr[i16] *= -13;
                }
                if (Test.bFld) {
                    for (f2 = 1; f2 < 2; ++f2) {
                        fFld = i17;
                        Test.instanceCount *= Test.instanceCount;
                        i19 -= 27;
                    }
                }
                i17 = (int)Test.instanceCount;
            }
            Test.lArrFld[i + 1] = (long)f2;
            i1 = 62;
            sFld += (short)-58930;
            fArr[i + 1] += (float)Test.dFld;
        }
        Test.iArrFld[(i >>> 1) % N] ^= i1;
        for (i21 = 5; i21 < 250; ++i21) {
            for (i23 = 3; i23 < 103; ++i23) {
                if (Test.bFld) continue;
            }
            Test.lArrFld[i21 - 1] += i24;
        }
        i19 ^= i1;
        Test.instanceCount *= i1;


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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
