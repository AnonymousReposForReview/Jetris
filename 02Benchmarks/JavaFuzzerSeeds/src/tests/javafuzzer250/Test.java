package tests.javafuzzer250;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 00:54:58 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-7668317257279634539L;
    public static byte byFld=-11;
    public float fFld=-37.630F;
    public boolean bFld=true;
    public static short sFld=10076;
    public static int iFld=-85;
    public static long lArrFld[]=new long[N];
    public static int iArrFld[]=new int[N];
    public static double dArrFld[]=new double[N];
    public static float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1283607467766794519L);
        FuzzerUtils.init(Test.iArrFld, 54112);
        FuzzerUtils.init(Test.dArrFld, -64.126021);
        FuzzerUtils.init(Test.fArrFld, 0.392F);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i7) {

        int i8=10, i9=3, i10=-118, i11=12;
        byte by=-5;
        short s=25395;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -62.280F);

        for (i8 = 247; i8 > 11; i8 -= 3) {
            Test.lArrFld[i8] |= i9;
        }
        for (i10 = 11; i10 < 333; i10++) {
            Test.iArrFld[i10] += i10;
            Test.dArrFld[i10 + 1] = i10;
            by = (byte)202L;
            i9 += (i10 * i10);
        }
        i9 <<= i7;
        fArr[(i9 >>> 1) % N] += s;
        Test.instanceCount = i8;
        i9 *= i8;
        i7 = -12;
        Test.instanceCount = Test.instanceCount;
        fArr = fArr;
        i9 = (int)Test.instanceCount;
        vMeth2_check_sum += i7 + i8 + i9 + i10 + i11 + by + s + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static void vMeth1(int i4, int i5) {

        int i6=7, i12=-119, i13=-46482;
        long l1=2697814863L;
        double d=1.15171;
        byte by1=-23;
        float f=1.806F;
        boolean b=true;

        i6 = 1;
        while (++i6 < 337) {
            vMeth2(i6);
            for (l1 = i6; l1 < 5; l1 += 3) {
                i5 *= i4;
                i13 = 1;
                do {
                    i12 >>= 106;
                    i4 &= (int)l1;
                    i5 = i5;
                    d -= 50397;
                    d -= by1;
                    i5 -= (int)f;
                    d -= f;
                } while (++i13 < 1);
                b = b;
                Test.iArrFld[i6 + 1] -= (int)d;
            }
            b = b;
        }
        vMeth1_check_sum += i4 + i5 + i6 + l1 + i12 + i13 + Double.doubleToLongBits(d) + by1 + Float.floatToIntBits(f)
            + (b ? 1 : 0);
    }

    public static void vMeth(int i, int i1) {

        int i2=35, i3=-166, i14=-45122, i15=-6494, i16=10;
        long l=-1992386538L;
        double d1=-2.104078;

        for (i2 = 127; i2 > 1; --i2) {
            l = 1;
            while (++l < 12) {
                Test.instanceCount &= i3;
                vMeth1(-11, i);
            }
            Test.byFld = (byte)d1;
            i = Test.byFld;
        }
        for (float f1 : Test.fArrFld) {
            i14 = 1;
            while (++i14 < 4) {
                i3 += (((i14 * Test.instanceCount) + Test.byFld) - i14);
                d1 = f1;
                if (false) {
                    for (i15 = 1; i15 > i14; i15 -= 2) {
                        f1 += i15;
                        f1 = i14;
                        Test.instanceCount = Test.instanceCount;
                    }
                }
            }
        }
        vMeth_check_sum += i + i1 + i2 + i3 + l + Double.doubleToLongBits(d1) + i14 + i15 + i16;
    }

    public void mainTest(String[] strArr1) {

        int i17=0, i18=-30901, i19=-28564, i20=0, i21=-3, i22=-3, i23=48549;
        float f2=-52.835F;

        vMeth(i17, i17);
        i17 += 7;
        for (f2 = 10; f2 < 346; f2++) {
            i19 = 1;
            while (++i19 < 75) {
                for (i20 = 1; i20 < 1; i20++) {
                    Test.instanceCount += (i20 * i20);
                    fFld += 122;
                    bFld = bFld;
                    if (bFld) {
                        i18 += i18;
                        if (bFld) continue;
                    } else if (bFld) {
                        Test.instanceCount += i21;
                        i17 = i17;
                        Test.iArrFld[(int)(f2)] |= i20;
                    } else if (false) {
                        i21 -= (int)58.48;
                        Test.iArrFld[i19] = Test.sFld;
                        i18 <<= -22010;
                    } else {
                        i21 *= i20;
                    }
                    Test.instanceCount <<= i17;
                }
                i18 += i19;
                if (bFld) continue;
                Test.iArrFld[i19 + 1] = Test.byFld;
            }
            Test.instanceCount *= (long)f2;
            i18 += (int)(f2 * f2);
            for (i22 = 1; i22 < 75; i22++) {
                fFld = i22;
                Test.sFld += (short)(i22 * i22);
                i17 = i21;
                Test.iArrFld[(int)(f2 - 1)] = Test.iFld;
                i17 = (int)fFld;
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