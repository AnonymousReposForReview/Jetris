package tests.javafuzzer60;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:38:48 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=1871130813L;
    public static float fFld=-1.734F;
    public static short sFld=7595;
    public static byte byFld=78;
    public int iFld=18189;

    public static long vSmallMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vSmallMeth() {

        short s=-6923;
        int iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, 0);

        Test.fFld *= s;
        iArr1 = (iArr1 = (iArr1 = iArr1));
        vSmallMeth_check_sum += s + FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth2(int i8, int i9) {


        i8 = i9;
        vMeth2_check_sum += i8 + i9;
    }

    public static void vMeth1(int i7) {

        int i10=32978, i11=172, i12=-48729, i13=-8, i14=0, i15=-7687, i16=20, iArr2[]=new int[N];
        byte by=69;
        boolean b=false;

        FuzzerUtils.init(iArr2, 3);

        vMeth2(i7, i7);
        Test.sFld -= (short)Test.instanceCount;
        for (i10 = 1; i10 < 238; ++i10) {
            i12 = 1;
            do {
                iArr2[i10] += i12;
                for (i13 = 1; i13 < 1; i13++) {
                    i11 &= by;
                    Test.instanceCount += i13;
                    i7 -= -114;
                    i7 += (i13 * i12);
                }
                for (i15 = 1; i15 < 1; ++i15) {
                    switch ((i12 % 6) + 55) {
                    case 55:
                        i7 <<= i13;
                        i7 += (((i15 * i14) + by) - i7);
                        break;
                    case 56:
                        Test.sFld = (short)i16;
                    case 57:
                        i7 = (int)Test.instanceCount;
                    case 58:
                        Test.instanceCount <<= i7;
                    case 59:
                    case 60:
                        b = b;
                        break;
                    }
                }
            } while (++i12 < 7);
        }
        vMeth1_check_sum += i7 + i10 + i11 + i12 + i13 + i14 + by + i15 + i16 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr2);
    }

    public static void vMeth(double d, int i2) {

        int i3=-7, i4=-246, i5=-33986, i6=-6162;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, 114.238F);

        i3 = 1;
        while (++i3 < 270) {
            vSmallMeth();
            i2 -= i2;
            i2 = -32278;
            d += (((i2 + 12) + (Test.instanceCount - d)) * ((-(-(Test.fFld + i3))) - (-(++i2))));
            i2 <<= (int)(Math.max((int)(Test.instanceCount * Test.fFld), i3) + Test.fFld);
            if (true) {
                i2 = (int)(-1.90425 * (i2--));
                i4 = 1;
                do {
                    i2 <<= (--Test.sFld);
                    for (i5 = i4; i5 < 1; i5++) {
                        vMeth1(i2);
                        fArr[i4] = i4;
                        Test.fFld = i5;
                        i6 = i2;
                    }
                } while (++i4 < 6);
            }
        }
        vMeth_check_sum += Double.doubleToLongBits(d) + i2 + i3 + i4 + i5 + i6 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public void mainTest(String[] strArr1) {

        int i=-1, i17=-205, i18=-56383, i19=7, i20=-2, i21=-7, i22=-12, i23=228, i24=6, iArr[]=new int[N];
        double d1=0.6872;
        boolean b1=true, bArr[]=new boolean[N];
        short sArr[]=new short[N];

        FuzzerUtils.init(iArr, 0);
        FuzzerUtils.init(sArr, (short)-6086);
        FuzzerUtils.init(bArr, true);

        i = 1;
        while (++i < 210) {
            for (int smallinvoc=0; smallinvoc<62; smallinvoc++) vSmallMeth();
            iArr[i - 1] -= i;
        }
        vMeth(d1, i);
        i17 = 1;
        while (++i17 < 188) {
            sArr[i17 + 1] *= (short)i;
            d1 *= Test.byFld;
            for (i18 = i17; i18 < 133; i18++) {
                Test.instanceCount -= i17;
            }
            i20 = 1;
            do {
                Test.instanceCount += (long)d1;
            } while (++i20 < 133);
            switch ((((i18 >>> 1) % 8) * 5) + 98) {
            case 100:
                iArr[i17 + 1] = i;
                iArr[i17 + 1] = i;
                for (i21 = 133; i21 > 6; i21 -= 2) {
                    Test.fFld += -51719;
                    sArr[i17] = (short)i;
                    for (i23 = 1; i23 < 3; i23++) {
                        b1 = b1;
                        iArr[i17] += i;
                        try {
                            iFld = (iArr[i23 - 1] / -72557798);
                            iArr[i17] = (14721 / i21);
                            iFld = (480573411 / iArr[i17]);
                        } catch (ArithmeticException a_e) {}
                        i22 += iFld;
                        bArr[i21 + 1] = b1;
                        Test.instanceCount /= -47956L;
                        bArr[i23 - 1] = b1;
                        iFld <<= Test.sFld;
                        switch ((((30547 >>> 1) % 1) * 5) + 3) {
                        case 6:
                        default:
                            Test.instanceCount >>= Test.instanceCount;
                        }
                    }
                    i22 = (int)Test.fFld;
                }
                iArr[i17] = iFld;
                break;
            case 105:
                iFld -= (int)d1;
                break;
            case 113:
                Test.fFld -= 0.4F;
                break;
            case 123:
                try {
                    i19 = (iArr[i17 + 1] / iArr[i17]);
                    iArr[i17 - 1] = (i % 211);
                    i19 = (iArr[i17 + 1] / iFld);
                } catch (ArithmeticException a_e) {}
                break;
            case 117:
                iArr[i17] += 14;
                break;
            case 109:
                d1 -= i19;
                break;
            case 118:
                Test.fFld -= Test.fFld;
            case 137:
                Test.fFld = Test.instanceCount;
                break;
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
//DEBUG  vSmallMeth ->  vSmallMeth mainTest Test vMeth
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
