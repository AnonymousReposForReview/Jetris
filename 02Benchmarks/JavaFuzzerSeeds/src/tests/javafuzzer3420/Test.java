package tests.javafuzzer3420;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Fri Sep  1 07:51:04 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-488666226432951097L;
    public static byte byFld=-107;
    public static int iFld=-125;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -95);
        FuzzerUtils.init(Test.lArrFld, 5355882622516019758L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i9, int i10, int i11) {


        i9 >>= (int)Test.instanceCount;
        long meth_res = i9 + i10 + i11;
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth1(double d, int i4) {

        int i5=32498, i6=-2859, i7=8, i8=-1269;
        long l1=-3493017406982848814L, lArr[]=new long[N];

        FuzzerUtils.init(lArr, -234L);

        for (i5 = 5; 147 > i5; ++i5) {
            for (i7 = 1; 11 > i7; i7++) {
                Test.instanceCount = -2L;
                i8 += i7;
                i8 += (i7 * i7);
                lArr = (lArr = (lArr = (lArr = lArr)));
            }
            i4 >>= 110;
            Test.iArrFld = (Test.iArrFld = (Test.iArrFld = (Test.iArrFld = Test.iArrFld)));
            Test.instanceCount = -9742;
            sMeth(i8, i6, i5);
            d += i8;
        }
        Test.instanceCount -= l1;
        vMeth1_check_sum += Double.doubleToLongBits(d) + i4 + i5 + i6 + i7 + i8 + l1 + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(int i, long l, int i1) {

        int i2=-28, i3=102, i12=-40523, i13=38, i14=170, i15=19657, i16=23078, i17=-54530;
        double d1=-95.63022;
        float f=-59.534F;
        boolean b=true;

        l *= i1;
        if (b) {
            for (i2 = 129; 4 < i2; i2 -= 2) {
                vMeth1(d1, i);
            }
        } else if (b) {
            for (i12 = 19; i12 < 372; ++i12) {
                l = i;
                f += Test.byFld;
                switch ((((-191 >>> 1) % 8) * 5) + 41) {
                case 71:
                    i14 = 1;
                    while (++i14 < 5) {
                        try {
                            i3 = (Test.iArrFld[i14 - 1] % 26264);
                            i = (16565 % Test.iArrFld[i14 + 1]);
                            i = (Test.iArrFld[i12 + 1] / 50822);
                        } catch (ArithmeticException a_e) {}
                        Test.byFld += (byte)(i14 | l);
                        for (i15 = 1; i15 < 1; i15++) {
                            l = i15;
                            f += i15;
                            if (i3 != 0) {
                                vMeth_check_sum += i + l + i1 + i2 + i3 + Double.doubleToLongBits(d1) + i12 + i13 +
                                    Float.floatToIntBits(f) + i14 + i15 + i16 + i17 + (b ? 1 : 0);
                                return;
                            }
                        }
                    }
                    break;
                case 77:
                    i3 *= 117;
                    break;
                case 53:
                    Test.byFld <<= (byte)Test.instanceCount;
                case 61:
                    i3 *= (int)-31.457F;
                    break;
                case 62:
                case 58:
                    if (false) break;
                    break;
                case 50:
                    i = (int)Test.instanceCount;
                case 51:
                    i3 += (240 + (i12 * i12));
                    break;
                default:
                    i17 >>= i;
                }
            }
        }
        vMeth_check_sum += i + l + i1 + i2 + i3 + Double.doubleToLongBits(d1) + i12 + i13 + Float.floatToIntBits(f) +
            i14 + i15 + i16 + i17 + (b ? 1 : 0);
    }

    public void mainTest(String[] strArr1) {

        double d2=105.98245, d3=99.61795;
        int i18=27658, i19=39032, i20=6, i21=5669, i22=-51106, i23=11731, i24=0, i25=-166;
        float f2=0.501F;
        short s=-14120;
        boolean b1=false;

        vMeth(9434, Test.instanceCount, 9);
        Test.iFld = (int)d2;
        for (d3 = 387; 20 < d3; --d3) {
            Test.iFld *= i18;
            for (i19 = 4; i19 < 69; i19++) {
                for (i21 = (int)(d3); i21 < 2; i21++) {
                    float f1=54.819F;
                    f1 *= Test.instanceCount;
                    Test.byFld *= (byte)d2;
                    Test.instanceCount <<= Test.instanceCount;
                    i18 = (int)1.171F;
                }
                Test.lArrFld[(int)(d3)] >>>= Test.byFld;
                f2 = -2;
                s += (short)(i19 * i19);
            }
            i23 = 1;
            while (++i23 < 69) {
                for (i24 = 1; i24 < 1; i24++) {
                    Test.lArrFld[i23 - 1] = Test.instanceCount;
                    i18 = i23;
                    switch ((i23 % 10) + 20) {
                    case 20:
                        i25 = i21;
                        f2 *= Test.byFld;
                        Test.lArrFld[i24] -= i20;
                        i18 += (i24 - i19);
                        break;
                    case 21:
                        Test.byFld = (byte)26286;
                        break;
                    case 22:
                        Test.iFld = -171;
                        switch ((int)((d3 % 7) + 51)) {
                        case 51:
                            Test.lArrFld = Test.lArrFld;
                            if (b1) break;
                            b1 = b1;
                            Test.iFld = i19;
                        case 52:
                            if (b1) break;
                            break;
                        case 53:
                            i22 = (int)Test.instanceCount;
                            break;
                        case 54:
                            i18 <<= -16614;
                            break;
                        case 55:
                            s = (short)-45916;
                        case 56:
                            Test.iArrFld[i23] += -13;
                            break;
                        case 57:
                            i20 += (((i24 * Test.iFld) + Test.instanceCount) - i18);
                            break;
                        default:
                            Test.instanceCount += i24;
                        }
                    case 23:
                        i25 += (i24 ^ Test.byFld);
                        break;
                    case 24:
                        Test.iFld = i20;
                        break;
                    case 25:
                        i18 <<= i24;
                        break;
                    case 26:
                        Test.iArrFld = FuzzerUtils.int1array(N, (int)-51308);
                        break;
                    case 27:
                        i25 = (int)d2;
                        break;
                    case 28:
                        f2 *= Test.instanceCount;
                        break;
                    case 29:
                        Test.iArrFld[i24] >>= i25;
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
//DEBUG  sMeth ->  sMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
