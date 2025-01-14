package tests.javafuzzer62;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Tue Aug 29 21:39:01 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=17720L;
    public boolean bFld=true;
    public float fFld=-18.780F;
    public static int iFld=-11;
    public byte byFld=-47;
    public int iFld1=10;
    public long lArrFld[]=new long[N];
    public static volatile int iArrFld[]=new int[N];
    public static int iArrFld1[][]=new int[N][N];

    static {
        FuzzerUtils.init(Test.iArrFld, -40411);
        FuzzerUtils.init(Test.iArrFld1, -135);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long vMeth_check_sum = 0;

    public static void vMeth(int i3, float f2, int i4) {

        byte by=-75;
        int i5=-116, i6=-177, i7=-7, i8=-30734, iArr[]=new int[N];
        short s=11367;
        double d1=114.51409;

        FuzzerUtils.init(iArr, 4);

        by = (byte)i3;
        i4 = 14;
        i5 = 1;
        while (++i5 < 292) {
            s = (short)-62441;
            iArr[i5] &= i4;
            for (d1 = 1; d1 < 6; d1++) {
                switch (((i5 % 2) * 5) + 30) {
                case 39:
                    Test.instanceCount = Test.instanceCount;
                    break;
                case 32:
                    for (i7 = (int)(d1); i7 < 2; i7 += 3) {
                        i4 -= by;
                        by = (byte)i3;
                        i3 = s;
                    }
                    i6 |= (int)Test.instanceCount;
                    break;
                }
                f2 += (float)(((d1 * f2) + i3) - i6);
                i4 += (int)d1;
            }
        }
        vMeth_check_sum += i3 + Float.floatToIntBits(f2) + i4 + by + i5 + s + Double.doubleToLongBits(d1) + i6 + i7 +
            i8 + FuzzerUtils.checkSum(iArr);
    }

    public static int iMeth1(int i1, int i2) {

        float f1=68.124F, f3=2.161F;
        int i9=-185, i10=-53266, i11=58894, i13=48726, i14=174, iArr1[]=new int[N];
        boolean b=false;
        double d2=0.50709, dArr[]=new double[N];

        FuzzerUtils.init(dArr, 18.20717);
        FuzzerUtils.init(iArr1, -10);

        dArr[(i1 >>> 1) % N] += (f1++);
        vMeth(2, f1, 63694);
        f3 = 1;
        while (++f3 < 303) {
            for (i9 = 5; i9 > 1; i9 -= 2) {
                int i12=-103;
                i1 = (int)Test.instanceCount;
                i2 += i9;
                i11 = (int)Test.instanceCount;
                b = b;
                i11 <<= i12;
                i11 = i1;
                Test.instanceCount += 59;
                iArr1[(int)(f3 - 1)] <<= i9;
            }
            for (i13 = 5; i13 > f3; i13 -= 3) {
                i11 = (int)d2;
                i14 = (int)Test.instanceCount;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f1) + Float.floatToIntBits(f3) + i9 + i10 + i11 + (b ? 1 : 0) +
            i13 + i14 + Double.doubleToLongBits(d2) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) +
            FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(double d, int i, long l) {

        int i15=7, i16=247, i17=-36456, i18=-246, i19=96, i20=-7007, iArr2[]=new int[N];
        short s1=6827;

        FuzzerUtils.init(iArr2, 40300);

        switch ((((-8 >>> 1) % 2) * 5) + 108) {
        case 116:
            lArrFld[(i >>> 1) % N] <<= (Math.min(l / (i | 1), -iMeth1(209, i)) | l);
            i += (int)1.125469;
            for (i15 = 3; i15 < 147; ++i15) {
                for (i17 = 1; i17 < 11; ++i17) {
                    iArr2[i15] -= (int)d;
                    for (i19 = 1; i19 < 2; ++i19) {
                        i18 -= 23117;
                        i16 = i18;
                    }
                    i18 *= (int)Test.instanceCount;
                    i18 = i;
                    if (bFld) {
                        iArr2[i15 + 1] *= (int)d;
                    } else {
                        fFld -= l;
                        i18 += i17;
                    }
                }
            }
            break;
        case 118:
            l = i19;
            break;
        default:
            s1 |= (short)i19;
        }
        long meth_res = Double.doubleToLongBits(d) + i + l + i15 + i16 + i17 + i18 + i19 + i20 + s1 +
            FuzzerUtils.checkSum(iArr2);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        float f=0.206F;
        int i21=-33, i22=-74, i23=-38783, i24=56998, i25=11, i26=2, i27=13;
        long l1=-1395259230L;
        short s2=21021;
        double d3=1.127810;

        f = ((iMeth(-2.94382, Test.iFld, Test.instanceCount) * Test.instanceCount) - 602083009605747094L);
        try {
            Test.iFld = (int)Test.instanceCount;
        }
        catch (ArrayIndexOutOfBoundsException exc1) {
            Test.iFld = (int)-90.42568;
            for (i21 = 4; i21 < 211; ++i21) {
                i22 = i21;
            }
            i23 = 394;
            do {
                for (l1 = 3; l1 < 64; ++l1) {
                    Test.instanceCount -= Test.instanceCount;
                    for (i25 = 1; i25 < 2; i25++) {
                        i24 = s2;
                        i22 -= (int)f;
                        d3 = i24;
                        i27 = -82;
                        i22 += (i25 + i22);
                        Test.iFld >>= Test.iFld;
                        Test.instanceCount = -9;
                        Test.iFld = (int)Test.instanceCount;
                        i22 += s2;
                        if (false) continue;
                    }
                    Test.iArrFld = FuzzerUtils.int1array(N, (int)198);
                    byFld *= (byte)l1;
                    iFld1 += (49868 + (l1 * l1));
                    switch (((-112 >>> 1) % 2) + 39) {
                    case 39:
                        i24 -= 29270;
                        Test.instanceCount = Test.iFld;
                        Test.iArrFld1 = FuzzerUtils.int2array(N, (int)-3);
                        i24 += (int)(l1 * s2);
                        break;
                    case 40:
                        d3 -= -50105;
                        i22 = (int)l1;
                    }
                }
            } while (--i23 > 0);
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
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
