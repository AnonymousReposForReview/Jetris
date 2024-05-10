package tests.javafuzzer1555;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 22:54:07 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=7L;
    public static int iFld=-47917;
    public static double dFld=-31.104686;
    public static byte byFld=37;
    public boolean bFld=false;
    public static byte byArrFld[]=new byte[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.byArrFld, (byte)8);
        FuzzerUtils.init(Test.lArrFld, 31L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2() {

        boolean b1=false;
        short s=2509;
        float f=2.753F;
        int i5=-11, i6=198, i7=-14, iArr[]=new int[N];
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -461788549248123337L);
        FuzzerUtils.init(iArr, -3601);

        Test.instanceCount += Test.instanceCount;
        for (long l1 : lArr) {
            b1 = false;
            Test.iFld = s;
            Test.iFld >>>= Test.iFld;
            iArr = iArr;
            for (f = 1; f < 4; f++) {
                iArr[(int)(f)] <<= i5;
                Test.dFld = Test.iFld;
                switch ((int)(((f % 2) * 5) + 52)) {
                case 55:
                    i5 -= Test.iFld;
                    for (i6 = 2; 1 < i6; --i6) {
                        lArr[i6 + 1] &= i5;
                        i5 -= i5;
                        s += (short)(i6 * i6);
                    }
                    break;
                case 54:
                    Test.byFld = (byte)0;
                    break;
                }
            }
        }
        vMeth2_check_sum += (b1 ? 1 : 0) + s + Float.floatToIntBits(f) + i5 + i6 + i7 + FuzzerUtils.checkSum(lArr) +
            FuzzerUtils.checkSum(iArr);
    }

    public static void vMeth1(boolean b, int i4) {

        int i8=-5, i9=158, i10=-132, i11=-19862, i12=55324, i13=34878, i14=-1, iArr1[]=new int[N];
        float f1=0.455F, fArr[]=new float[N];

        FuzzerUtils.init(iArr1, 7573);
        FuzzerUtils.init(fArr, -120.881F);

        vMeth2();
        i8 = 1;
        while (++i8 < 357) {
            try {
                Test.iFld = (i4 % 1054549051);
                i4 = (i8 / -35394);
                iArr1[i8] = (i8 % Test.iFld);
            } catch (ArithmeticException a_e) {}
            i4 += (((i8 * i4) + Test.iFld) - Test.byFld);
            Test.iFld += i8;
            for (i9 = 1; i9 < 5; ++i9) {
                i10 = i4;
                i4 += i9;
            }
            for (i11 = 1; i11 < 5; ++i11) {
                Test.instanceCount -= Test.iFld;
                f1 -= f1;
                for (i13 = i11; i13 < 2; ++i13) {
                    fArr[i11 - 1] %= 34073;
                    fArr[i13 - 1] -= i14;
                    try {
                        iArr1[i13] = (i12 % iArr1[i13]);
                        i12 = (43460 % i8);
                        i14 = (iArr1[i13] / iArr1[i8]);
                    } catch (ArithmeticException a_e) {}
                }
            }
        }
        vMeth1_check_sum += (b ? 1 : 0) + i4 + i8 + i9 + i10 + i11 + i12 + Float.floatToIntBits(f1) + i13 + i14 +
            FuzzerUtils.checkSum(iArr1) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth(int i, int i1, long l) {

        int i2=1, i3=-18955, i15=-53690, i16=54937, i17=-5, i18=140, iArr2[]=new int[N];
        boolean b2=false;

        FuzzerUtils.init(iArr2, -252);

        for (i2 = 230; i2 > 6; i2 -= 3) {
            vMeth1(false, i);
            Test.byArrFld = FuzzerUtils.byte1array(N, (byte)102);
            for (i15 = 1; 21 > i15; i15 += 2) {
                i3 *= i;
                iArr2[i15] = (int)-7384963898085735286L;
                for (i17 = 1; i17 < 3; i17++) {
                    Test.instanceCount -= Test.instanceCount;
                    i3 = 14;
                    i16 += i17;
                    i16 = i17;
                    if (b2) break;
                    i = (int)Test.instanceCount;
                }
                i = Test.byFld;
                i18 >>= Test.iFld;
            }
        }
        vMeth_check_sum += i + i1 + l + i2 + i3 + i15 + i16 + i17 + i18 + (b2 ? 1 : 0) + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i19=-252, i20=133, i22=-167, i23=-1980, i24=-162, iArr3[]=new int[N];
        double d=-38.113164;
        float f2=1.919F;
        short s1=-16910;

        FuzzerUtils.init(iArr3, 43271);

        vMeth(Test.iFld, Test.iFld, Test.instanceCount);
        for (i19 = 13; 327 > i19; i19++) {
            for (d = 3; d < 80; d++) {
                i22 = (int)Test.instanceCount;
                Test.iFld += (int)d;
                iArr3[(int)(d - 1)] -= (int)f2;
                Test.iFld += i19;
                Test.byFld -= (byte)Test.instanceCount;
                Test.byFld = (byte)Test.instanceCount;
                i20 = i19;
                for (i23 = 2; i23 > 1; i23--) {
                    if (bFld) break;
                    iArr3[i23 - 1] = i22;
                    Test.dFld %= (i22 | 1);
                    switch ((int)((d % 4) + 54)) {
                    case 54:
                        Test.instanceCount = i19;
                        i22 = (int)36632L;
                        i22 += i23;
                        f2 += Test.iFld;
                        break;
                    case 55:
                        i22 += 54569;
                        break;
                    case 56:
                        i24 = i22;
                    case 57:
                        Test.lArrFld = FuzzerUtils.long1array(N, (long)94L);
                        if (false) {
                            i24 = i24;
                        } else if (bFld) {
                            Test.dFld = i23;
                            Test.iFld = (int)Test.instanceCount;
                            switch ((int)(((d % 3) * 5) + 87)) {
                            case 102:
                                i22 *= i23;
                                bFld = true;
                                break;
                            case 88:
                                i20 += (i23 + Test.instanceCount);
                                break;
                            case 98:
                                Test.iFld += i23;
                                break;
                            default:
                                try {
                                    i22 = (i20 % i20);
                                    i20 = (i23 % i24);
                                    i24 = (i20 % 14636);
                                } catch (ArithmeticException a_e) {}
                            }
                        } else {
                            s1 -= (short)104.128043;
                        }
                        break;
                    }
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}