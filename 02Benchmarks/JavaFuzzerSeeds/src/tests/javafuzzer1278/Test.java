package tests.javafuzzer1278;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 17:39:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-228L;
    public static long lFld=44622L;
    public static float fFld=2.1010F;
    public static byte byFld=-93;
    public static short sFld=-18256;
    public static long lArrFld[][]=new long[N][N];
    public static int iArrFld[]=new int[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3361990242L);
        FuzzerUtils.init(Test.iArrFld, 7471);
        FuzzerUtils.init(Test.fArrFld, -2.184F);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long bMeth_check_sum = 0;

    public static boolean bMeth(short s, double d) {

        int i10=-50638, i11=-172;
        byte by=-24;
        boolean b=true;

        i10 = 195;
        do {
            i11 += i10;
            Test.lFld += i10;
            switch ((((i10 >>> 1) % 10) * 5) + 53) {
            case 62:
                if (false) break;
                Test.lArrFld[i10][i10] = i10;
                if (b) {
                    Test.fFld += Test.fFld;
                    by ^= (byte)i11;
                } else {
                    if (b) break;
                }
                i11 += i10;
                break;
            case 96:
                switch ((i10 % 2) + 109) {
                case 109:
                    try {
                        i11 = (-1410020956 % i11);
                        Test.iArrFld[i10] = (i10 % -236);
                        Test.iArrFld[i10 - 1] = (Test.iArrFld[i10 + 1] % i11);
                    } catch (ArithmeticException a_e) {}
                    i11 -= (int)Test.instanceCount;
                    i11 += -44;
                case 110:
                    Test.iArrFld[i10] /= (int)(Test.instanceCount | 1);
                    break;
                default:
                    i11 *= i11;
                }
                break;
            case 95:
                Test.iArrFld[i10 + 1] = 64866;
                break;
            case 63:
                Test.instanceCount += (1 + (i10 * i10));
                break;
            case 75:
                i11 = (int)Test.instanceCount;
                break;
            case 79:
            case 60:
                Test.fFld += i10;
            case 87:
                i11 %= (int)36.448F;
                break;
            case 56:
                Test.lFld = (long)-1.108138;
            case 73:
                i11 += (i10 + s);
            }
        } while (--i10 > 0);
        long meth_res = s + Double.doubleToLongBits(d) + i10 + i11 + by + (b ? 1 : 0);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public static long lMeth() {

        int i6=-153, i7=7, i8=-37, i9=10, i12=-245, i13=-37729, i14=42886, i15=-28432;
        double d1=101.78087;

        for (i6 = 4; 156 > i6; ++i6) {
            for (i8 = i6; 10 > i8; ++i8) {
                if (bMeth((short)(26941), d1)) continue;
                i9 = i9;
            }
            Test.iArrFld[i6 - 1] = (int)Test.fFld;
        }
        i9 += 1;
        for (i12 = 2; i12 < 353; ++i12) {
            Test.instanceCount = Test.instanceCount;
            Test.iArrFld[i12 - 1] <<= -2;
            Test.instanceCount -= i13;
            for (i14 = i12; i14 < 5; i14++) {
                Test.lFld *= (long)Test.fFld;
                Test.instanceCount += i7;
                try {
                    i15 = (i12 / Test.iArrFld[i12]);
                    i13 = (i12 / i15);
                    i9 = (3 / i7);
                } catch (ArithmeticException a_e) {}
                Test.lFld += (i14 | i8);
            }
        }
        long meth_res = i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + i12 + i13 + i14 + i15;
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public static int iMeth(int i2, int i3) {

        int i4=-11, i5=-10, i16=-4, i17=152, i18=32048, i19=-232, i20=-3;
        float f=-1.971F, f1=-1.284F;
        double d2=-1.78531;

        for (i4 = 11; 302 > i4; ++i4) {
            f = lMeth();
            i5 = 8;
            Test.iArrFld[(i4 >>> 1) % N] -= (int)Test.instanceCount;
        }
        i16 = 1;
        do {
            i5 <<= i4;
        } while (++i16 < 352);
        for (i17 = 3; i17 < 201; i17++) {
            i5 += (((i17 * i18) + i2) - i16);
            i19 = 1;
            while (++i19 < 8) {
                i18 -= i16;
                i5 += i18;
                for (f1 = 1; f1 < 1; f1++) {
                    i5 %= (int)(i18 | 1);
                    Test.byFld = (byte)Test.instanceCount;
                }
                d2 += f1;
            }
        }
        long meth_res = i2 + i3 + i4 + i5 + Float.floatToIntBits(f) + i16 + i17 + i18 + i19 + Float.floatToIntBits(f1)
            + i20 + Double.doubleToLongBits(d2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i=-24, i1=-12005, i21=238, i22=-9, i23=0, i24=-7, i25=5, i27=-8;
        boolean b1=false;
        float f2=0.957F;

        for (i = 374; i > 21; i -= 2) {
            i1 += i;
            iMeth(i1, i);
            Test.lArrFld[i + 1][i + 1] += i;
            Test.fArrFld[(20207 >>> 1) % N] = i21;
            i1 = i21;
        }
        i22 = 1;
        do {
            Test.byFld *= (byte)i;
            i21 = (int)Test.instanceCount;
            i21 *= (int)Test.fFld;
        } while (++i22 < 272);
        for (i23 = 3; i23 < 342; i23++) {
            b1 = false;
            i24 += (i23 + i21);
            i1 = (int)Test.instanceCount;
            Test.instanceCount |= Test.lFld;
            i25 = 1;
            while (++i25 < 74) {
                if (b1) continue;
                i1 = i24;
                Test.lArrFld[i23 - 1] = Test.lArrFld[i25 - 1];
                i1 *= i;
                Test.iArrFld[i23 + 1] <<= i;
            }
            for (f2 = 3; f2 < 74; ++f2) {
                i24 *= i21;
                i24 &= i22;
            }
        }
        i24 = (int)5L;
        try {
            i27 = i23;
            i24 = i25;
            i1 += i1;
            Test.instanceCount = i25;
        }
        catch (UserDefinedExceptionTest exc1) {
            i1 += Test.sFld;
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
class UserDefinedExceptionTest extends RuntimeException {
    public int field;
}

//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  lMeth ->  lMeth iMeth mainTest
//DEBUG  bMeth ->  bMeth lMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}