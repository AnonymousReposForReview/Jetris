package tests.javafuzzer2620;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 17:36:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=12L;
    public static short sFld=-27698;
    public int iFld=21;
    public float fFld=-89.419F;
    public byte byFld=-40;
    public boolean bFld=true;
    public static int iArrFld[]=new int[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -89);
        FuzzerUtils.init(Test.lArrFld, -7686L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long sMeth_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth1(short s) {


        Test.instanceCount = Test.instanceCount;
        vMeth1_check_sum += s;
    }

    public static void vMeth2(byte by, long l1, byte by1) {

        float f=-2.86F;
        int i5=49999, i6=1, i7=14, i8=11, iArr1[]=new int[N];
        boolean b=false;
        long lArr[]=new long[N];
        byte byArr[]=new byte[N];

        FuzzerUtils.init(iArr1, 159);
        FuzzerUtils.init(lArr, -1689249251L);
        FuzzerUtils.init(byArr, (byte)-83);

        Test.sFld = (short)1.198F;
        f = Test.instanceCount;
        for (i5 = 6; i5 < 140; ++i5) {
            i6 += i5;
        }
        i6 = i6;
        by1 += (byte)Test.instanceCount;
        switch (((-45091 >>> 1) % 2) + 125) {
        case 125:
            if (b) {
                switch (((i6 >>> 1) % 2) + 91) {
                case 91:
                    iArr1[(i6 >>> 1) % N] >>= (int)Test.instanceCount;
                    break;
                case 92:
                    lArr[(i6 >>> 1) % N] = -12850;
                    if (b) {
                        for (i7 = 14; i7 < 298; i7++) {
                            i6 += i6;
                            i6 = i6;
                        }
                    }
                    break;
                }
                vMeth2_check_sum += by + l1 + by1 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
                return;
            } else if (b) {
                i6 <<= i5;
            }
        case 126:
            by1 = (byte)i6;
        }
        vMeth2_check_sum += by + l1 + by1 + Float.floatToIntBits(f) + i5 + i6 + i7 + i8 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr1) + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(byArr);
    }

    public static short sMeth(int i3) {

        int i4=6, i9=89, i10=-12825, i11=28083, i12=2, i13=-54755, i14=70, iArr[]=new int[N];
        double d=58.65060;
        short s1=-936, sArr[]=new short[N];
        byte by3=-79;

        FuzzerUtils.init(iArr, 160);
        FuzzerUtils.init(sArr, (short)622);

        iArr[(i3 >>> 1) % N] -= Math.max(i3, i4--);
        i4 *= (int)(((38182 + (-iArr[(i4 >>> 1) % N])) - (Test.instanceCount -= i3)) * ((d / ((long)(d) | 1)) - (s1 +
            -12)));
        vMeth2(by3, Test.instanceCount, (byte)(64));
        for (i9 = 11; i9 < 303; ++i9) {
            for (i11 = i9; i11 < 6; i11++) {
                float f1=2.883F;
                short s2=-11877;
                i3 -= (int)f1;
                s2 -= (short)Test.instanceCount;
                i4 >>= (int)Test.instanceCount;
                sArr[i11] = (short)i10;
                for (i13 = 1; i13 < 1; ++i13) {
                    i10 &= i10;
                    i10 = i13;
                    i4 = (int)Test.instanceCount;
                    i4 += (int)Test.instanceCount;
                    i12 += (i13 ^ i12);
                }
            }
        }
        long meth_res = i3 + i4 + Double.doubleToLongBits(d) + s1 + by3 + i9 + i10 + i11 + i12 + i13 + i14 +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(sArr);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth(int i, long l) {

        int i1=-24887, i2=5, i15=0, i16=-49;

        i1 = 305;
        while ((i1 -= 3) > 0) {
            i += (int)(-142 % ((Test.instanceCount - (l--)) | 1));
            i2 += (int)(l = ((i & i1) - 56277L));
            vMeth1(sMeth(i1));
        }
        for (i15 = 9; i15 < 160; ++i15) {
            i *= (int)-2.22805;
        }
        vMeth_check_sum += i + l + i1 + i2 + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        int i17=12, i18=24126, i19=19057, i20=44563, i21=-4, i22=-47, i23=-13;
        long l2=-14L;
        double d1=41.96931;
        byte byArr1[][]=new byte[N][N];

        FuzzerUtils.init(byArr1, (byte)-5);

        vMeth(iFld, Test.instanceCount);
        byArr1[(iFld >>> 1) % N][(iFld >>> 1) % N] = (byte)iFld;
        for (i17 = 7; 155 > i17; i17 += 2) {
            fFld = i18;
            for (l2 = 338; l2 > 17; l2 -= 3) {
                d1 += fFld;
                for (i20 = 4; i20 > 1; --i20) {
                    Test.iArrFld[i20] *= (int)Test.instanceCount;
                    try {
                        i19 = (-188 / i21);
                        i19 = (-1069136787 % i17);
                        Test.iArrFld[i20 - 1] = (i17 / -46696);
                    } catch (ArithmeticException a_e) {}
                    i18 -= (int)fFld;
                    if (true) break;
                    Test.instanceCount = i17;
                    Test.instanceCount += i20;
                }
                switch ((int)((l2 % 10) + 58)) {
                case 58:
                    for (i22 = 1; i22 < 4; i22++) {
                        Test.instanceCount += l2;
                        switch ((int)(((l2 % 5) * 5) + 109)) {
                        case 111:
                            fFld += i22;
                            i23 <<= -16;
                        case 115:
                            i19 &= i19;
                            i21 = i23;
                            i23 = (int)d1;
                            Test.lArrFld[(int)(l2)] = i21;
                            break;
                        case 134:
                            iFld += (i22 * i22);
                            Test.instanceCount -= i23;
                            i19 = Test.sFld;
                            Test.lArrFld[i22 - 1] ^= 2;
                        case 129:
                            i21 >>= byFld;
                            Test.iArrFld[i22 - 1] += 131;
                            bFld = bFld;
                            break;
                        case 112:
                            i21 <<= 174;
                            break;
                        }
                    }
                    break;
                case 59:
                    i21 += i21;
                    break;
                case 60:
                    byFld &= (byte)-11;
                    break;
                case 61:
                    i23 *= (int)d1;
                    break;
                case 62:
                    i23 <<= iFld;
                    break;
                case 63:
                    Test.iArrFld[i17 - 1] -= iFld;
                case 64:
                    byArr1[i17][i17 + 1] += (byte)i18;
                    break;
                case 65:
                    Test.instanceCount += l2;
                    break;
                case 66:
                    bFld = bFld;
                    break;
                case 67:
                    fFld = i23;
                    break;
                default:
                    fFld += l2;
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
//DEBUG  sMeth ->  sMeth vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 sMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
