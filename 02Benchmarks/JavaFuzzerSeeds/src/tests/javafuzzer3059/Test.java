package tests.javafuzzer3059;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 01:21:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=42597L;
    public static int iFld=-153;
    public static float fFld=-1.336F;
    public byte byArrFld[]=new byte[N];
    public static volatile float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.fArrFld, -74.311F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public void vMeth2() {

        int i4=0, i5=6, i6=-1, i7=-30853, iArr[]=new int[N];
        float f1=-101.678F;
        double d=-1.110978;
        short s1=10305;
        boolean b=true;

        FuzzerUtils.init(iArr, 89);

        if (b) {
            i4 += (int)f1;
            i4 -= 67;
            for (byte by : byArrFld) {
                d += Test.instanceCount;
                i5 = 1;
                do {
                    f1 = Test.instanceCount;
                    Test.instanceCount *= i4;
                    for (i6 = 1; i6 < 1; ++i6) {
                        if (b) {
                            iArr = iArr;
                        } else if (b) {
                            i4 = s1;
                            if (b) continue;
                        }
                        i7 = (int)Test.instanceCount;
                        by -= (byte)Test.instanceCount;
                    }
                } while (++i5 < 4);
            }
        } else {
            Test.iFld *= Test.iFld;
        }
        vMeth2_check_sum += i4 + Float.floatToIntBits(f1) + Double.doubleToLongBits(d) + i5 + i6 + i7 + s1 + (b ? 1 :
            0) + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth1() {

        float f=2.548F;
        int i2=-5538, i3=152, i8=3, i9=59326, i10=2, i11=-11;
        boolean b1=true;
        double d1=0.75927;
        byte by1=111;

        f -= 12;
        for (i2 = 1; i2 < 302; ++i2) {
            vMeth2();
            if (b1) break;
        }
        i8 = 307;
        do {
            if (b1) break;
        } while (--i8 > 0);
        Test.iFld = i2;
        i9 = 1;
        while (++i9 < 340) {
            for (i10 = 1; 5 > i10; ++i10) {
                Test.iFld += (-69 + (i10 * i10));
                d1 = i9;
                f += i9;
                Test.instanceCount = i10;
                i3 = by1;
                Test.iFld = i8;
            }
        }
        vMeth1_check_sum += Float.floatToIntBits(f) + i2 + i3 + (b1 ? 1 : 0) + i8 + i9 + i10 + i11 +
            Double.doubleToLongBits(d1) + by1;
    }

    public void vMeth(int i, int i1, short s) {

        int i12=4, i13=8, i14=-149, i15=-22501, i16=7, i17=-103, i18=-10;
        float f2=118.640F;
        byte byArr[]=new byte[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(byArr, (byte)-5);
        FuzzerUtils.init(lArr, -4L);

        i &= (-(byArr[(i >>> 1) % N]--));
        vMeth1();
        Test.instanceCount &= Test.iFld;
        i12 = 1;
        do {
            lArr[i12 + 1] = i1;
            Test.instanceCount += i12;
            for (i13 = i12; i13 < 6; i13++) {
                for (i15 = 1; i15 < 1; i15++) {
                    Test.instanceCount = (long)f2;
                    Test.fArrFld[i13 + 1] -= i16;
                }
                for (i17 = 1; i17 < 1; ++i17) {
                    i1 *= (int)-63L;
                    i1 += (9 + (i17 * i17));
                    i14 += (12 + (i17 * i17));
                    lArr[i13 - 1] /= -95;
                }
            }
        } while (++i12 < 277);
        vMeth_check_sum += i + i1 + s + i12 + i13 + i14 + i15 + i16 + Float.floatToIntBits(f2) + i17 + i18 +
            FuzzerUtils.checkSum(byArr) + FuzzerUtils.checkSum(lArr);
    }

    public void mainTest(String[] strArr1) {

        short s2=12413;
        int i19=-14, i20=-14, i21=6, i22=14, i23=-9323, i24=-9006, i25=42374, i26=0, i27=0, i28=-152, iArr1[]=new
            int[N];
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr1, 4);
        FuzzerUtils.init(lArr1, 4L);

        vMeth(Test.iFld, Test.iFld, (short)(12932));
        Test.iFld = (int)Test.instanceCount;
        s2 |= (short)Test.iFld;
        Test.iFld = (int)Test.fFld;
        Test.iFld -= (int)165L;
        for (i19 = 6; i19 < 261; i19++) {
            iArr1[i19 - 1] = i21;
            lArr1[i19 + 1] -= 60498;
            Test.instanceCount -= (long)Test.fFld;
        }
        i20 -= -95;
        i22 = 1;
        do {
            for (i23 = 6; i23 < 112; i23++) {
                i21 = Test.iFld;
                i20 += (((i23 * i21) + i19) - i23);
                Test.instanceCount <<= -27482;
            }
            for (i25 = 1; i25 < 112; i25++) {
                for (i27 = 1; i27 < 2; i27++) {
                    boolean b2=false;
                    i21 *= i24;
                    i28 &= i28;
                    Test.instanceCount = i22;
                    if (b2) continue;
                    i21 += (i27 + i26);
                    if (false) {
                        try {
                            Test.iFld = (i21 % -61109);
                            i21 = (255 / i21);
                            i28 = (i28 / i24);
                        } catch (ArithmeticException a_e) {}
                        Test.fFld += -102;
                    } else if (b2) {
                        try {
                            i26 = (19850 % iArr1[i22]);
                            Test.iFld = (Test.iFld % -173);
                            i21 = (-33975 % i26);
                        } catch (ArithmeticException a_e) {}
                        i20 -= i28;
                        i20 >>= i25;
                    } else if (b2) {
                    }
                    Test.fFld += (i27 * Test.fFld);
                    i26 <<= (int)Test.instanceCount;
                }
            }
        } while (++i22 < 225);


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
