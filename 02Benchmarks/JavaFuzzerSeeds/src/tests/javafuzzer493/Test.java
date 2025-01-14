package tests.javafuzzer493;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 04:41:22 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=11L;
    public static int iFld=0;
    public static boolean bFld=true;
    public short sFld=3270;
    public static volatile byte byFld=51;
    public int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];
    public static int iArrFld1[]=new int[N];
    public static long lArrFld1[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld1, 0);
        FuzzerUtils.init(Test.lArrFld1, 10L);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth() {

        int i4=223, i5=-23377, i6=-13, i7=52353, i8=-11, i9=-8, i10=102, i11=-4;
        long l1=230L;
        double d1=0.33261;

        Test.iFld &= (int)254L;
        for (i4 = 19; i4 < 365; ++i4) {
            for (i6 = 1; i6 < 5; ++i6) {
                Test.iFld = (int)2374L;
                Test.iArrFld1[i4] = i7;
            }
            i8 = 5;
            do {
                Test.instanceCount = Test.iFld;
            } while (--i8 > 0);
            if (Test.bFld) continue;
            Test.instanceCount = 243;
        }
        for (l1 = 6; 162 > l1; l1++) {
            for (i10 = 1; i10 < 10; ++i10) {
                i5 -= (int)d1;
                Test.instanceCount += (i10 * i10);
                Test.instanceCount -= i8;
                i11 -= i9;
            }
        }
        vMeth_check_sum += i4 + i5 + i6 + i7 + i8 + l1 + i9 + i10 + i11 + Double.doubleToLongBits(d1);
    }

    public static int iMeth1() {


        vMeth();
        long meth_res = 0;
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(long l) {

        int i=20, i1=7, i2=6, i3=-13, iArr[]=new int[N];
        double d=1.97331;
        float f=-2.782F;
        short s=-2989;
        byte by=114;

        FuzzerUtils.init(iArr, -144);

        for (i = 132; i > 6; i--) {
            float f1=-53.471F;
            Test.iFld = (int)(i1 -= (int)(iArr[i - 1] >> (long)(d + i)));
            for (i2 = 1; 12 > i2; i2++) {
                Test.instanceCount += (i2 | i2);
                f -= (float)((l++) * (-39767 + (++d)));
            }
            switch ((((((int)(s + Test.instanceCount)) >>> 1) % 7) * 5) + 81) {
            case 97:
                i3 += (--i3);
                f = (by = (byte)(iMeth1() + -76.464F));
                Test.bFld = false;
                i3 += i1;
                break;
            case 89:
                switch (((i % 1) * 5) + 110) {
                case 112:
                    d = 2864536777206684536L;
                    Test.lArrFld1[i - 1] -= i1;
                    break;
                }
            case 100:
                f1 -= (float)d;
            case 111:
                i1 += (((i * i2) + i2) - f1);
                break;
            case 103:
                i1 >>= i;
                break;
            case 91:
                i3 = i2;
                break;
            case 114:
                i3 >>= i;
            }
        }
        long meth_res = l + i + i1 + Double.doubleToLongBits(d) + i2 + i3 + Float.floatToIntBits(f) + s + by +
            FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i12=-12, i13=-61458, i14=9, i15=-45279, i16=-14, i17=9, iArr1[]=new int[N];
        float f2=2.633F;

        FuzzerUtils.init(iArr1, -77);

        iArrFld[(Test.iFld >>> 1) % N] = (int)(-(lArrFld[(Test.iFld >>> 1) % N] >>>= iMeth(-3175759630L)));
        for (i12 = 1; i12 < 177; i12++) {
            i13 >>= 47014;
            Test.iArrFld1[i12] = 13;
            for (i14 = 143; i14 > i12; i14--) {
                i15 *= (int)Test.instanceCount;
                i13 = i14;
                for (i16 = 1; 1 > i16; i16++) {
                    float f3=124.940F;
                    switch ((((i16 >>> 1) % 2) * 5) + 97) {
                    case 101:
                        if (Test.bFld) continue;
                        if (Test.bFld) {
                            i17 <<= -22;
                            Test.lArrFld1[i12 - 1] = sFld;
                            i17 += (i16 - f2);
                        } else if (Test.bFld) {
                            if (Test.bFld) {
                                Test.instanceCount = i15;
                                Test.byFld -= (byte)-12;
                            }
                        } else {
                            Test.instanceCount += i12;
                            if (true) continue;
                            Test.iFld = i12;
                            i13 >>= Test.iFld;
                        }
                        i15 = sFld;
                        i15 = 30855;
                        break;
                    case 98:
                        i13 = sFld;
                        Test.instanceCount |= 108;
                        break;
                    default:
                        sFld = (short)Test.instanceCount;
                        f3 += i13;
                        iArrFld[i16 + 1] = i12;
                        Test.instanceCount -= Test.byFld;
                    }
                    iArr1 = Test.iArrFld1;
                }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
