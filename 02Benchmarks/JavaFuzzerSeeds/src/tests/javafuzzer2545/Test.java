package tests.javafuzzer2545;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 16:26:42 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-955988488L;
    public static float fFld=96.233F;
    public static int iFld=-14286;
    public static short sFld=-23911;
    public static volatile boolean bFld=true;
    public static double dArrFld[]=new double[N];
    public static long lArrFld[][]=new long[N][N];
    public short sArrFld[]=new short[N];
    public static boolean bArrFld[]=new boolean[N];

    static {
        FuzzerUtils.init(Test.dArrFld, 0.76476);
        FuzzerUtils.init(Test.lArrFld, 1997425902L);
        FuzzerUtils.init(Test.bArrFld, true);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i1=14, i2=9, i4=5, i5=-185, iArr1[]=new int[N];
        short s=17521;

        FuzzerUtils.init(iArr1, 31757);

        for (i1 = 9; i1 < 375; i1++) {
            boolean b=false;
            if (b) break;
            switch ((i1 % 3) + 82) {
            case 82:
                Test.iFld = -16645;
                i2 = i2;
                iArr1 = iArr1;
                if (i2 != 0) {
                    vMeth1_check_sum += i1 + i2 + i4 + i5 + s + FuzzerUtils.checkSum(iArr1);
                    return;
                }
                break;
            case 83:
                for (i4 = 1; i4 < 5; ++i4) {
                    iArr1[i1] *= i1;
                    i5 += (int)Test.instanceCount;
                }
                break;
            case 84:
                s += (short)i1;
            default:
                Test.iFld += (-254 + (i1 * i1));
                Test.iFld &= i2;
                Test.iFld += i1;
            }
            Test.instanceCount += (((i1 * i4) + i5) - i5);
        }
        vMeth1_check_sum += i1 + i2 + i4 + i5 + s + FuzzerUtils.checkSum(iArr1);
    }

    public static int iMeth() {

        boolean b1=false;
        int i6=18968, i7=-200, i8=-206, i9=-5, iArr2[]=new int[N];
        double d1=-65.108868;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)24716);
        FuzzerUtils.init(iArr2, 40815);

        if (b1) {
            Test.dArrFld = (Test.dArrFld = (Test.dArrFld = (Test.dArrFld = Test.dArrFld)));
            Test.iFld += (int)((-Test.iFld) + ((Test.instanceCount + Test.iFld) - (Test.instanceCount &= Test.iFld)));
            Test.fFld = Test.iFld;
        } else if (false) {
            vMeth1();
        } else {
            Test.lArrFld[(Test.iFld >>> 1) % N] = FuzzerUtils.long1array(N, (long)-15L);
        }
        for (i6 = 18; i6 < 364; ++i6) {
            i7 *= i6;
            Test.iFld -= Test.iFld;
            i7 += i7;
            Test.instanceCount += Test.iFld;
            sArr[i6 - 1] = (short)i7;
            for (i8 = 1; i8 < 5; i8++) {
                Test.instanceCount += (long)d1;
                iArr2[i8 - 1] += (int)Test.instanceCount;
            }
        }
        long meth_res = (b1 ? 1 : 0) + i6 + i7 + i8 + i9 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr) +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(byte by, int i) {

        double d=105.23639;
        int i10=2, i11=13999, i12=-122, i13=44285, i14=-1842, i15=0, iArr[][]=new int[N][N];
        float f=-2.569F, fArr[]=new float[N];
        long l=34164L;

        FuzzerUtils.init(fArr, 2.468F);
        FuzzerUtils.init(iArr, -240);

        Test.fFld += ((long)(fArr[(i >>> 1) % N] - Test.fFld) >>> (long)((i - d) - (60 - (i * Test.fFld))));
        iArr[(-200 >>> 1) % N][(i >>> 1) % N] += (int)((iMeth() - 28) * Test.instanceCount);
        Test.lArrFld[(-26697 >>> 1) % N][(Test.iFld >>> 1) % N] = -6;
        Test.instanceCount = 23386;
        for (i10 = 3; i10 < 167; i10++) {
            Test.instanceCount += (((i10 * f) + f) - i12);
            for (i13 = 1; i13 < 10; ++i13) {
                Test.fFld += -13;
                Test.iFld += (int)f;
            }
            for (l = 10; l > i10; --l) {
                Test.lArrFld[(int)(l + 1)][(int)(l)] = -234;
            }
            i12 = Test.sFld;
            if (Test.bFld) {
                i12 = (int)-2782214641959635148L;
                Test.sFld <<= (short)i13;
            } else if (Test.bFld) {
                Test.iFld -= (int)-102L;
            }
        }
        vMeth_check_sum += by + i + Double.doubleToLongBits(d) + i10 + i11 + Float.floatToIntBits(f) + i12 + i13 + i14
            + l + i15 + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        byte by1=-7;
        int i16=-250, i17=-120, i18=11, i19=140, i20=-8, i21=11, i22=15115, iArr3[][]=new int[N][N];
        long l1=0L;
        double d2=0.126350;

        FuzzerUtils.init(iArr3, 5123);

        vMeth(by1, Test.iFld);
        Test.iFld = (int)Test.instanceCount;
        i16 = 1;
        while (++i16 < 144) {
            i17 = 1;
            do {
                for (i18 = 1; i18 < 1; ++i18) {
                    Test.iFld += (int)(12017L + (i18 * i18));
                    if (Test.bFld) break;
                }
                try {
                    i19 = (i16 / 46655);
                    Test.iFld = (i17 / 32);
                    i19 = (i19 / -143);
                } catch (ArithmeticException a_e) {}
                iArr3[i17] = iArr3[i17];
                switch ((i16 % 10) + 35) {
                case 35:
                    i19 = (int)Test.instanceCount;
                    i19 += (i17 * i17);
                    Test.fFld += (i17 + i18);
                    i19 = i20;
                case 36:
                    sArrFld = FuzzerUtils.short1array(N, (short)-14074);
                    Test.iFld -= (int)Test.instanceCount;
                    break;
                case 37:
                    i19 += (((i17 * Test.instanceCount) + Test.sFld) - Test.instanceCount);
                    Test.iFld -= (int)Test.instanceCount;
                    i20 += (int)-5547058642006278238L;
                    break;
                case 38:
                    iArr3[i17 + 1] = FuzzerUtils.int1array(N, (int)-3);
                    for (l1 = i17; l1 < 1; l1++) {
                        if (Test.bFld) continue;
                        Test.instanceCount = (long)Test.fFld;
                    }
                    break;
                case 39:
                    Test.iFld += (i17 * i19);
                case 40:
                    switch (((i16 % 8) * 5) + 125) {
                    case 139:
                        i21 &= i17;
                        break;
                    case 157:
                        i22 = 1;
                        while (++i22 < 1) {
                            i21 = (int)Test.instanceCount;
                            d2 += d2;
                            Test.instanceCount -= by1;
                        }
                        break;
                    case 160:
                        Test.instanceCount = i17;
                        break;
                    case 164:
                        i21 += i17;
                    case 126:
                        Test.instanceCount += (long)d2;
                    case 158:
                        Test.dArrFld[i17] *= -18334;
                        break;
                    case 136:
                        Test.bArrFld[i17] = Test.bFld;
                        break;
                    case 152:
                        if (Test.bFld) continue;
                        break;
                    }
                case 41:
                    i20 = i16;
                case 42:
                    Test.instanceCount = i22;
                case 43:
                    Test.fFld = i16;
                case 44:
                    iArr3[i16 + 1] = iArr3[i16 - 1];
                    break;
                }
            } while (++i17 < 174);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}