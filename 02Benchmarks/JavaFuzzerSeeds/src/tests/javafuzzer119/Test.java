package tests.javafuzzer119;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:42:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=42690L;
    public static volatile short sFld=-18725;
    public static boolean bFld=true;
    public static volatile byte byFld=-38;
    public static volatile long lFld=29L;
    public static float fFld=-71.367F;
    public int iArrFld[]=new int[N];
    public static byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)-41);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long iMeth2_check_sum = 0;

    public static int iMeth2(int i12) {

        int i13=-1, i14=5595, i15=-3, i16=-216, iArr3[]=new int[N];
        double dArr[]=new double[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(dArr, 1.75535);
        FuzzerUtils.init(iArr3, -46464);
        FuzzerUtils.init(lArr1, 5447369857792711199L);

        for (double d2 : dArr) {
            i12 -= (int)d2;
            i12 |= 24692;
            Test.instanceCount += 247L;
            for (i13 = 1; 4 > i13; ++i13) {
                for (i15 = i13; 2 > i15; ++i15) {
                    if (Test.bFld) {
                        i14 += i15;
                        Test.bFld = Test.bFld;
                    } else if (Test.bFld) {
                        Test.instanceCount += Test.instanceCount;
                        iArr3[i15 - 1] += i15;
                        lArr1[i13 - 1] = i14;
                    }
                    i16 *= (int)d2;
                    i12 *= i14;
                    if (i12 != 0) {
                    }
                }
            }
        }
        long meth_res = i12 + i13 + i14 + i15 + i16 + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr3) + FuzzerUtils.checkSum(lArr1);
        iMeth2_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth1(int i5, int i6) {

        int i7=6, i8=24218, i9=-230, i10=-30087, i11=-12, iArr2[]=new int[N];
        double d=24.85827, d1=114.31098;
        float f=-1.542F;

        FuzzerUtils.init(iArr2, -11);

        Test.bFld = Test.bFld;
        Test.instanceCount <<= ((++i5) * (++i5));
        for (i7 = 1; 209 > i7; ++i7) {
            for (i9 = i7; i9 < 8; ++i9) {
                for (d = 1; d > 1; --d) {
                    try {
                        i5 = (i6 / iArr2[i7 + 1]);
                        iArr2[i7 + 1] = (i6 / 52);
                        iArr2[i7] = (i11 / -22700);
                    } catch (ArithmeticException a_e) {}
                    Test.bFld = (Test.instanceCount > (++d1));
                    i5 += (int)(((d * f) + f) - i9);
                    i10 += iMeth2(i6);
                    i11 += (int)(d * Test.instanceCount);
                    Test.byFld = (byte)i8;
                    i5 = (int)Test.instanceCount;
                    Test.byFld -= (byte)Test.instanceCount;
                    i11 = i5;
                }
                Test.byFld += (byte)i9;
            }
        }
        long meth_res = i5 + i6 + i7 + i8 + i9 + i10 + Double.doubleToLongBits(d) + i11 + Double.doubleToLongBits(d1) +
            Float.floatToIntBits(f) + FuzzerUtils.checkSum(iArr2);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth() {

        int i3=-238, i4=0, i17=1, i18=-9, i19=205, i20=-224, iArr[]=new int[N], iArr1[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(iArr1, 172);
        FuzzerUtils.init(lArr, -6966059054529599275L);

        for (int i2 : iArr) {
            if ((--i2) <= iArr1[(-223 >>> 1) % N]) break;
            Test.sFld += (short)Math.abs(Integer.reverseBytes(i2 * 39));
            for (i3 = 1; i3 < 4; ++i3) {
                i4 >>= Math.max(--i4, i3);
                i4 *= (int)Math.min(5L, (Test.sFld + i3) | (--iArr[(i2 >>> 1) % N]));
                iArr[i3] >>= (++Test.sFld);
                lArr[i3 + 1] = ((iMeth1(i3, i3) * -175L) - -3);
            }
            if (i4 != 0) {
            }
        }
        if (Test.bFld) {
            i17 >>= -123;
            i18 = 329;
            while ((i18 -= 2) > 0) {
                for (i19 = 1; i19 < 10; i19++) {
                    if (Test.bFld) break;
                    i4 = 23;
                }
            }
        } else {
            Test.bFld = Test.bFld;
        }
        long meth_res = i3 + i4 + i17 + i18 + i19 + i20 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(iArr1) +
            FuzzerUtils.checkSum(lArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=14726, i1=55, i21=5, i22=-201, i23=38390, i24=-55;
        long l=35L, lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 201L);

        for (i = 8; 270 > i; i++) {
            double d3=19.117303;
            iArrFld[i - 1] /= (int)(Math.min((int)(iMeth() * d3), i1) | 1);
            if (Test.bFld) continue;
            i1 += i;
            i21 = 1;
            do {
                for (i22 = 1; i22 < 3; ++i22) {
                    Test.instanceCount += i22;
                    d3 = i;
                    switch ((i21 % 2) + 117) {
                    case 117:
                        i1 += (((i22 * i) + i23) - i);
                        break;
                    case 118:
                        switch (((i21 >>> 1) % 3) + 82) {
                        case 82:
                            i1 += (14 + (i22 * i22));
                            lArr2 = lArr2;
                            Test.instanceCount *= Test.instanceCount;
                            break;
                        case 83:
                            i24 &= i24;
                            Test.instanceCount = -11864;
                            Test.instanceCount += (long)d3;
                            break;
                        case 84:
                            i1 += i22;
                            i24 *= i21;
                            break;
                        default:
                            lArr2[i] *= 71;
                            iArrFld[i21 - 1] = i21;
                        }
                        i1 += i22;
                        Test.lFld += (long)d3;
                        break;
                    default:
                        i23 = (int)Test.instanceCount;
                        d3 = l;
                        Test.byArrFld = Test.byArrFld;
                        Test.lFld += (i22 + Test.fFld);
                    }
                    i23 += (((i22 * i22) + i24) - i22);
                    Test.instanceCount = (long)Test.fFld;
                    Test.instanceCount >>= i;
                }
            } while ((i21 += 3) < 96);
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
//DEBUG  iMeth2 ->  iMeth2 iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
