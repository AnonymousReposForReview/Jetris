package tests.javafuzzer1484;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 21:18:23 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=8948385465431371768L;
    public static boolean bFld=false;
    public static short sFld=-752;
    public static int iFld=-84;
    public static volatile double dFld=-2.85839;
    public static volatile long lArrFld[][]=new long[N][N];
    public static int iArrFld[]=new int[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, 3536073247L);
        FuzzerUtils.init(Test.iArrFld, 44394);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1() {

        int i3=-49365, i4=30691, i5=46760, i6=59733, i7=10, i8=13228, i9=175, i10=8, i11=190, i12=-4, iArr[]=new int[N];
        float f1=12.829F, fArr[]=new float[N];
        double d=-2.12545;

        FuzzerUtils.init(fArr, 101.843F);
        FuzzerUtils.init(iArr, 135);

        for (i3 = 13; i3 < 213; ++i3) {
            i5 = 1;
            do {
                Test.bFld = Test.bFld;
            } while (++i5 < 8);
            i4 += i3;
            for (i6 = 1; i6 < 8; i6++) {
                Test.instanceCount = Test.instanceCount;
                for (i8 = 1; i8 < 2; ++i8) {
                    fArr[i6 + 1] -= -12L;
                    i9 = (int)f1;
                    i4 %= (int)(i5 | 1);
                }
                switch ((i3 % 9) + 107) {
                case 107:
                    for (i10 = 1; i10 < 2; i10++) {
                        i7 = (int)-116.183F;
                        f1 %= (i5 | 1);
                    }
                    break;
                case 108:
                    i7 *= (int)d;
                    break;
                case 109:
                    d = i12;
                    break;
                case 110:
                    try {
                        i12 = (1708240799 % iArr[(-241 >>> 1) % N]);
                        i7 = (38938 / i12);
                        i4 = (i11 % 161);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 111:
                    try {
                        i7 = (iArr[(i6 >>> 1) % N] / -23);
                        iArr[i3] = (63651 / iArr[i6]);
                        i9 = (i6 / -2093329527);
                    } catch (ArithmeticException a_e) {}
                    break;
                case 112:
                    i4 /= (int)(i4 | 1);
                    break;
                case 113:
                    iArr[i6 - 1] = i9;
                    break;
                case 114:
                    i4 += (((i6 * Test.instanceCount) + Test.instanceCount) - i4);
                    break;
                case 115:
                    Test.instanceCount += i6;
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + i7 + i8 + i9 + Float.floatToIntBits(f1) + i10 + i11 +
            Double.doubleToLongBits(d) + i12 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) +
            FuzzerUtils.checkSum(iArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth() {

        int i1=43960, i2=-61366, i13=-14, i14=-22510, i15=-203, iArr1[][]=new int[N][N];
        float f=127.16F;
        double d1=0.43926;

        FuzzerUtils.init(iArr1, -193);

        i1 = 1;
        do {
            f += (-i1);
            i2 += (i1 * i2);
            Test.bFld = ((i2 + (i2 - Test.instanceCount)) > iMeth1());
            i2 += i1;
            i2 += i1;
            switch (((i1 % 5) * 5) + 109) {
            case 113:
                Test.sFld += (short)Test.instanceCount;
                i13 = 1;
                do {
                    for (i14 = 1; i14 < 1; ++i14) {
                        Test.instanceCount -= i13;
                        if (true) {
                            d1 = 2841L;
                            Test.lArrFld[i1 - 1][i14 - 1] <<= i2;
                            f = f;
                        } else if (Test.bFld) {
                            i15 <<= (int)13L;
                        } else if (Test.bFld) {
                            i2 = (int)52285L;
                        }
                    }
                } while (++i13 < 8);
                break;
            case 124:
            case 114:
                f = i2;
                break;
            case 128:
                iArr1 = iArr1;
                break;
            case 121:
                d1 = Test.instanceCount;
                break;
            default:
                i15 = i1;
            }
        } while (++i1 < 206);
        vMeth_check_sum += i1 + Float.floatToIntBits(f) + i2 + i13 + i14 + i15 + Double.doubleToLongBits(d1) +
            FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        double d2=1.54250;
        int i16=41120, i17=5364, i18=-4, i19=-11, iArr2[]=new int[N];

        FuzzerUtils.init(iArr2, 18952);

        vMeth();
        Test.iFld -= (int)d2;
        iArr2[(Test.iFld >>> 1) % N] -= Test.iFld;
        i16 = 1;
        do {
            Test.iFld += i16;
            Test.iFld = -6873;
            Test.instanceCount += (long)d2;
            Test.iFld = Test.iFld;
            for (i17 = 1; i17 < 6; ++i17) {
                i18 = i16;
                i19 = 2;
                do {
                    Test.instanceCount *= Test.sFld;
                    Test.instanceCount -= (long)d2;
                    iArr2[i16 - 1] -= i16;
                    i18 += (i19 + Test.iFld);
                } while (--i19 > 0);
            }
        } while (++i16 < 273);
        long meth_res = Double.doubleToLongBits(d2) + i16 + i17 + i18 + i19 + FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=197, i20=8, i21=-18067, i22=124, i23=30881, i24=3, i25=-72, i26=52;
        float f2=0.807F;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)28472);

        i <<= (iMeth() + 220);
        f2 = i;
        Test.iArrFld[(191 >>> 1) % N] = Test.iFld;
        Test.lArrFld[(i >>> 1) % N][(i >>> 1) % N] = i;
        for (i20 = 15; i20 < 344; ++i20) {
            for (i22 = 1; i22 < 76; ++i22) {
                if (Test.bFld) {
                    try {
                        i23 = (Test.iArrFld[i22] / i20);
                        i21 = (i20 % -49);
                        i23 = (-138511985 % i20);
                    } catch (ArithmeticException a_e) {}
                    i23 = i21;
                    i21 >>= -18;
                    Test.instanceCount += Test.instanceCount;
                } else if (Test.bFld) {
                    Test.instanceCount -= i21;
                    if (Test.bFld) continue;
                    Test.iFld += i22;
                    Test.instanceCount += (i22 * i);
                } else {
                    i24 <<= i24;
                    try {
                        Test.iArrFld[i20] = (16632 % Test.iArrFld[i22]);
                        i = (-133 % Test.iArrFld[i20]);
                        i23 = (Test.iArrFld[i20 + 1] / -35934);
                    } catch (ArithmeticException a_e) {}
                }
                i = i24;
                i += (-103 + (i22 * i22));
                for (i25 = 1; i25 < 2; i25++) {
                    if (Test.bFld) {
                        Test.iArrFld[i25] = -24222;
                        Test.dFld += Test.instanceCount;
                        Test.iFld &= Test.sFld;
                        sArr[i25 - 1] -= (short)-6182030953081118826L;
                    } else {
                        switch (((i20 % 2) * 5) + 97) {
                        case 103:
                            Test.iArrFld[i22 - 1] = i20;
                            break;
                        case 104:
                            i21 -= i24;
                            Test.bFld = Test.bFld;
                            break;
                        default:
                            byArrFld = FuzzerUtils.byte1array(N, (byte)103);
                        }
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}