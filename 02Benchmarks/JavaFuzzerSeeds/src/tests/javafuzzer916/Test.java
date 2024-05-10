package tests.javafuzzer916;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 11:31:53 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-4497943472211470975L;
    public static short sFld=-31800;
    public static boolean bFld=false;
    public static float fFld=0.931F;
    public static int iFld=-29553;
    public static boolean bArrFld[]=new boolean[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.bArrFld, false);
        FuzzerUtils.init(Test.iArrFld, 1);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1(int i4, int i5) {

        int i6=-55449, i7=103, i8=-35582, i9=-129, i10=41132;
        byte by=-60;
        double d=23.97937;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -12L);

        lArr1[(i5 >>> 1) % N] += Test.instanceCount;
        Test.sFld = (short)44;
        for (i6 = 6; i6 < 383; i6 += 3) {
            for (i8 = 1; 13 > i8; i8++) {
                Test.bArrFld[i6] = Test.bFld;
                i5 *= -22591;
                Test.iArrFld[i6] = by;
                i4 += (i8 * Test.instanceCount);
                d -= Test.fFld;
            }
        }
        i10 = 1;
        while (++i10 < 387) {
            switch (((i10 % 1) * 5) + 12) {
            case 13:
            }
            Test.instanceCount -= i8;
        }
        if (Test.bFld) {
            i4 -= (int)Test.instanceCount;
            i4 *= (int)2.7601;
            vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + by + Double.doubleToLongBits(d) + i10 +
                FuzzerUtils.checkSum(lArr1);
            return;
        }
        vMeth1_check_sum += i4 + i5 + i6 + i7 + i8 + i9 + by + Double.doubleToLongBits(d) + i10 +
            FuzzerUtils.checkSum(lArr1);
    }

    public static int iMeth(int i2) {

        int i3=-32417, i11=19413, i12=-5, i13=103, i14=48442;
        double d1=87.102824;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-26937);

        try {
            if (Test.bFld) {
                i3 = 1;
                do {
                    vMeth1(i2, Test.iFld);
                    for (i11 = 1; i11 < (12 + 400); i11++) {
                        Test.iFld = i2;
                        Test.iFld -= i2;
                        sArr = sArr;
                        if (true) break;
                        for (i13 = 1 - 400; 1 > i13; i13++) {
                            i14 = -4;
                            i2 -= (int)-49246L;
                            Test.iFld += i12;
                        }
                        Test.iFld += i12;
                    }
                    i14 = (int)Test.instanceCount;
                } while (++i3 < 128);
            } else {
                d1 -= Test.instanceCount;
            }
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test.iArrFld[(i11 >>> 1) % N] = i2;
        }
        long meth_res = i2 + i3 + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d1) + FuzzerUtils.checkSum(sArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i1) {

        int i15=-26054, i16=4, i17=-210, i18=-9, i19=8, iArr[][]=new int[N][N];
        float f=0.538F, fArr[]=new float[N];
        long lArr2[]=new long[N];

        FuzzerUtils.init(fArr, -8.779F);
        FuzzerUtils.init(iArr, -42929);
        FuzzerUtils.init(lArr2, 2857318482L);

        Test.instanceCount = -75L;
        fArr[(i1 >>> 1) % N] = Math.abs(iArr[(i1 >>> 1) % N][(i1 >>> 1) % N]);
        i1 *= iMeth(i1);
        for (i15 = 3; i15 < 247; i15++) {
            for (i17 = 1; i17 < 7; i17 += 3) {
                if (Test.bFld) {
                    i1 -= i17;
                    if (Test.bFld) break;
                    for (f = i17; f < 4; ++f) {
                        i19 = i1;
                    }
                    i1 = Test.iFld;
                }
            }
        }
        i1 *= Test.iFld;
        i19 >>= (int)221L;
        i19 *= i19;
        lArr2[(-22 >>> 1) % N] = i1;
        vMeth_check_sum += i1 + i15 + i16 + i17 + i18 + Float.floatToIntBits(f) + i19 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)) + FuzzerUtils.checkSum(iArr) +
            FuzzerUtils.checkSum(lArr2);
    }

    public void mainTest(String[] strArr1) {

        long l=50670L, lArr[]=new long[N];
        int i=-3, i20=-236, i21=9, i22=53062, i23=149, i24=68, i25=0;
        double d2=-48.52153;

        FuzzerUtils.init(lArr, 63855L);

        l = 1;
        do {
            i -= -3490;
            i += (int)l;
            vMeth(Test.iFld);
            i <<= i;
            Test.iArrFld[(int)(l)] += (int)2.709F;
            for (i20 = 4; i20 < 134; i20++) {
                for (d2 = 1; d2 < 2; d2++) {
                    if (true) {
                        Test.iArrFld[(int)(d2 + 1)] = (int)Test.instanceCount;
                        Test.iFld <<= Test.iFld;
                    } else {
                        Test.instanceCount *= -33530;
                        Test.instanceCount >>= Test.sFld;
                    }
                    lArr[(int)(d2 - 1)] = Test.sFld;
                    i21 += i23;
                    Test.iFld = -30132;
                    Test.iArrFld[(int)(l)] -= (int)Test.fFld;
                    Test.instanceCount = l;
                }
                i22 >>= (int)l;
                switch ((i20 % 2) + 19) {
                case 19:
                    i += i20;
                    Test.iArrFld[(int)(l - 1)] -= (int)Test.fFld;
                    for (i24 = 1; i24 < 2; i24++) {
                        Test.fFld += i21;
                        i23 -= (int)Test.fFld;
                        Test.sFld += (short)2.994F;
                        Test.iArrFld[(int)(l + 1)] -= 190;
                        i22 += (6 + (i24 * i24));
                        i22 = (int)Test.fFld;
                    }
                    break;
                case 20:
                    Test.instanceCount &= l;
                    break;
                default:
                    i21 >>= -28082;
                }
            }
        } while ((l += 2) < 375);



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
