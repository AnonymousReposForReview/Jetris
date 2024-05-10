package tests.javafuzzer118;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 22:42:18 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3573577311L;
    public int iFld=54454;
    public static float fFld=-2.354F;
    public static double dFld=-108.24388;
    public static volatile boolean bFld=true;
    public static long lArrFld[]=new long[N];
    public byte byArrFld[]=new byte[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -11L);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth(double d1) {

        int i4=-32, i5=-2, i6=7, i7=1, i8=2635, i9=13, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 65030);

        iArr1[(i4 >>> 1) % N] *= (int)Test.instanceCount;
        for (i5 = 5; i5 < 128; i5++) {
            d1 *= i5;
            i6 = i4;
            i7 = 1;
            do {
                for (i8 = 1; i8 < 1; i8++) {
                    boolean b=false;
                    Test.fFld += Test.instanceCount;
                    Test.fFld -= Test.instanceCount;
                    i6 = (int)Test.instanceCount;
                    b = b;
                    Test.instanceCount ^= Test.instanceCount;
                    Test.lArrFld[i5 - 1] *= Test.instanceCount;
                    try {
                        iArr1[i5 - 1] = (64338 / iArr1[i5]);
                        i4 = (79 / iArr1[i8]);
                        i9 = (iArr1[i7 - 1] % -1721777094);
                    } catch (ArithmeticException a_e) {}
                    d1 += i9;
                    i4 += (-7 + (i8 * i8));
                }
            } while (++i7 < 13);
        }
        long meth_res = Double.doubleToLongBits(d1) + i4 + i5 + i6 + i7 + i8 + i9 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static long lMeth() {

        int i2=-235, i3=-163, i10=5592, i11=-38325, iArr2[][]=new int[N][N];
        float f=2.242F;

        FuzzerUtils.init(iArr2, 131);

        for (i2 = 11; i2 < 190; ++i2) {
            i3 += (((i2 * i3) + f) - i2);
            i3 = (i3--);
            i3 -= iMeth(-2.105774);
            i3 += (int)Test.fFld;
            f = i3;
            Test.instanceCount >>= Test.instanceCount;
            for (i10 = 1; i10 < 9; ++i10) {
                iArr2[i2] = FuzzerUtils.int1array(N, (int)17635);
                i11 += (i10 * i10);
                i11 *= i10;
                i11 >>= i11;
                if (true) break;
                i3 += i11;
                i11 = (int)f;
            }
        }
        long meth_res = i2 + i3 + Float.floatToIntBits(f) + i10 + i11 + FuzzerUtils.checkSum(iArr2);
        lMeth_check_sum += meth_res;
        return (long)meth_res;
    }

    public void vMeth(long l) {

        int i12=12, i13=-45824, i14=23225, i15=10, i16=-53688, i17=-206, i18=6, iArr[]=new int[N];
        double d2=84.10917;
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr, 14);
        FuzzerUtils.init(fArr, 2.959F);

        for (int i1 : iArr) {
            iFld = (int)(Math.abs((int)(i1 + l)) - (lMeth() - Test.fFld));
            i1 = i1;
        }
        i12 = 1;
        while (++i12 < 145) {
            iFld += i12;
            iFld += (int)2.120527;
        }
        d2 -= i12;
        for (i13 = 11; i13 < 212; i13++) {
            fArr[i13] -= i12;
            iFld += i13;
            for (i15 = 1; i15 < 8; ++i15) {
                try {
                    i14 = (49188 % iArr[i13 - 1]);
                    i16 = (-636661166 / i15);
                    iFld = (iFld / iArr[i13 - 1]);
                } catch (ArithmeticException a_e) {}
            }
            for (i17 = 1; i17 < 8; i17++) {
                Test.fFld -= i18;
                d2 = d2;
            }
        }
        vMeth_check_sum += l + i12 + Double.doubleToLongBits(d2) + i13 + i14 + i15 + i16 + i17 + i18 +
            FuzzerUtils.checkSum(iArr) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        double d=-111.91635, dArr[]=new double[N];
        int i=41530, i19=10, i20=0, i21=150, i22=35344, i23=-154, i24=63, iArr3[]=new int[N], iArr4[][]=new int[N][N];
        long l1=-12L, l2=-29991L;

        FuzzerUtils.init(dArr, 1.62305);
        FuzzerUtils.init(iArr3, 12782);
        FuzzerUtils.init(iArr4, -47076);

        switch ((((((int)(iFld - Test.instanceCount)) >>> 1) % 2) * 5) + 46) {
        case 49:
            for (d = 358; d > 4; d -= 3) {
                vMeth(Test.instanceCount);
                dArr[(int)(d + 1)] += d;
                iFld = i;
                switch ((int)((d % 10) + 50)) {
                case 50:
                    for (l1 = 4; l1 < 212; l1++) {
                        byte by=-68;
                        for (l2 = (long)(d); l2 < 2; l2++) {
                            iFld += (int)(l2 * l2);
                            iArr3[(int)(l2 - 1)] -= (int)Test.fFld;
                            i = iFld;
                            iArr3[(int)(l2 + 1)] -= (int)Test.fFld;
                            i21 += (int)l2;
                            Test.lArrFld[(int)(d + 1)] += (long)d;
                        }
                        dArr[(int)(l1 - 1)] = Test.fFld;
                        by = (byte)l2;
                        i22 = 1;
                        while (++i22 < 2) {
                            i20 = i22;
                            Test.fFld *= i22;
                            Test.fFld += (((i22 * i21) + i20) - i);
                            Test.fFld += (((i22 * i22) + l2) - iFld);
                            Test.instanceCount += (((i22 * i19) + i21) - Test.instanceCount);
                            Test.dFld %= 88;
                        }
                        i19 -= (int)Test.dFld;
                        if (Test.bFld) {
                            iArr3[(int)(d - 1)] += (int)Test.instanceCount;
                            for (i23 = 1; i23 < 2; i23++) {
                                iArr4 = FuzzerUtils.int2array(N, (int)-158);
                                i20 -= (int)Test.fFld;
                            }
                        } else {
                            iArr4[(int)(l1 + 1)][(int)(d)] &= i22;
                        }
                    }
                case 51:
                    iArr4[(int)(d)][(int)(d + 1)] >>>= (int)Test.instanceCount;
                    break;
                case 52:
                    Test.instanceCount -= i22;
                    break;
                case 53:
                    dArr[(int)(d - 1)] = iFld;
                    break;
                case 54:
                    Test.fFld += (float)d;
                    break;
                case 55:
                    iArr4[(int)(d - 1)][(int)(d - 1)] = -28537;
                    break;
                case 56:
                    byArrFld[(int)(d)] = (byte)-4;
                case 57:
                    i24 += (int)d;
                    break;
                case 58:
                case 59:
                    i20 = i20;
                    break;
                default:
                    Test.instanceCount = i22;
                }
            }
        case 50:
            Test.instanceCount >>= i;
            break;
        default:
            i21 += (int)l2;
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
//DEBUG  lMeth ->  lMeth vMeth mainTest
//DEBUG  iMeth ->  iMeth lMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}