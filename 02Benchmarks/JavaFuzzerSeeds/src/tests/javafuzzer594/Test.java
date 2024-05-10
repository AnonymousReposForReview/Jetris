package tests.javafuzzer594;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 06:16:20 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3745336288L;
    public byte byFld=-50;
    public static short sFld=2540;
    public static volatile double dFld=-1.20214;
    public static float fArrFld[]=new float[N];
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.fArrFld, 76.47F);
        FuzzerUtils.init(Test.iArrFld, -172);
    }

    public static long bMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

    public static int iMeth1(int i7) {

        float f=126.342F, f1=0.101F;
        short s=-1413;
        int i8=-163, i9=-21592, i10=-9147, i11=15524;
        double d=-74.31847;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, 2867449702L);

        f *= s;
        for (i8 = 5; i8 < 196; ++i8) {
            i7 += (i8 - Test.instanceCount);
            i10 = 1;
            while (++i10 < 8) {
                i9 *= (int)Test.instanceCount;
                i9 -= i9;
                d *= i7;
                for (f1 = 1; f1 < 1; f1++) {
                    i9 += (int)2.971F;
                    if (true) continue;
                    i7 += -124;
                    i7 <<= i10;
                }
                i7 = i8;
                lArr[i8] = i8;
                s ^= s;
            }
        }
        long meth_res = i7 + Float.floatToIntBits(f) + s + i8 + i9 + i10 + Double.doubleToLongBits(d) +
            Float.floatToIntBits(f1) + i11 + FuzzerUtils.checkSum(lArr);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public static int iMeth(int i2, long l, boolean b) {

        int i3=-147, i4=-19915, i5=1, i6=-6, i12=-8977, i13=-21750, i14=-26, i15=-6, iArr[]=new int[N];
        float f2=2.831F;
        byte by=68;
        long lArr1[]=new long[N];

        FuzzerUtils.init(iArr, 1417);
        FuzzerUtils.init(lArr1, 0L);

        for (i3 = 9; i3 < 268; i3++) {
            i2 <<= (Math.max(Math.abs(i2), i4) * (i4 * (i4 + i2)));
            for (i5 = 6; i5 > 1; i5 -= 2) {
                i2 += (i5 - Test.instanceCount);
                iMeth1(i3);
            }
            i2 += (i3 * f2);
            for (i12 = 1; i12 < 6; ++i12) {
                i4 += (int)Test.instanceCount;
                by += (byte)i12;
                for (i14 = 1; i14 < 2; i14++) {
                    Test.fArrFld = FuzzerUtils.float1array(N, (float)0.620F);
                    iArr[i12] *= i2;
                    lArr1[i3] += i6;
                    if (true) continue;
                    i6 >>= i5;
                }
            }
        }
        long meth_res = i2 + l + (b ? 1 : 0) + i3 + i4 + i5 + i6 + Float.floatToIntBits(f2) + i12 + i13 + by + i14 +
            i15 + FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public boolean bMeth() {

        int i1=22045, i16=-94, i17=7, i18=-50906, iArr1[]=new int[N];
        boolean b1=true;
        float f3=-107.372F;
        double d1=-127.96368;
        long lArr2[]=new long[N];

        FuzzerUtils.init(lArr2, 179L);
        FuzzerUtils.init(iArr1, -248);

        i1 *= iMeth(i1, Test.instanceCount, b1);
        byFld = (byte)f3;
        for (i16 = 7; i16 < 185; ++i16) {
            Test.instanceCount += (-15418 + (i16 * i16));
            switch ((((i17 >>> 1) % 1) * 5) + 85) {
            case 90:
                switch (((i16 % 10) * 5) + 50) {
                case 57:
                    i1 /= (int)(i16 | 1);
                    break;
                case 67:
                    i1 -= (int)Test.instanceCount;
                    break;
                case 80:
                    i17 -= (int)Test.instanceCount;
                case 88:
                    i1 <<= (int)Test.instanceCount;
                    break;
                case 65:
                    for (d1 = i16; d1 < 9; d1++) {
                        Test.instanceCount += Test.sFld;
                        Test.fArrFld[(int)(d1 - 1)] += i18;
                        lArr2[i16 - 1] = -70;
                        if (b1) continue;
                    }
                case 58:
                    byFld += (byte)i16;
                    break;
                case 70:
                    i1 <<= -13;
                    break;
                case 75:
                    i1 += (int)Test.instanceCount;
                    break;
                case 96:
                    i1 %= (int)((long)(f3) | 1);
                    break;
                case 81:
                    iArr1[i16 + 1] = -246;
                    break;
                }
                break;
            default:
                i18 -= (int)Test.instanceCount;
            }
        }
        long meth_res = i1 + (b1 ? 1 : 0) + Float.floatToIntBits(f3) + i16 + i17 + Double.doubleToLongBits(d1) + i18 +
            FuzzerUtils.checkSum(lArr2) + FuzzerUtils.checkSum(iArr1);
        bMeth_check_sum += meth_res;
        return meth_res % 2 > 0;
    }

    public void mainTest(String[] strArr1) {

        int i=-57470, i20=-63424, i21=26715, i22=7, i23=38705, i24=16190, i25=-187, i26=4;
        float f4=11.10F;
        boolean b2=true;

        i = 1;
        while (++i < 395) {
            int i19=-195;
            if (bMeth()) continue;
            i19 += i;
            i19 += (int)4006065912L;
            for (i20 = 4; i20 < 64; i20++) {
                i21 += (((i20 * i19) + i21) - i21);
                i22 = 1;
                while (++i22 < 2) {
                    Test.iArrFld[i20] = 19599;
                    f4 -= Test.instanceCount;
                    b2 = true;
                    Test.iArrFld[i22 + 1] = i19;
                    if (false) {
                        i21 += (i22 | i20);
                    } else if (b2) {
                        f4 += (i22 * i22);
                    } else if (b2) {
                        i21 *= (int)Test.instanceCount;
                        i21 = i21;
                        i21 = 28462;
                    } else {
                        i19 *= i20;
                        Test.instanceCount <<= i20;
                    }
                    Test.instanceCount = 55L;
                    i21 <<= i20;
                    Test.dFld = i22;
                    Test.instanceCount += (i22 * i22);
                }
                f4 -= i19;
            }
            for (i23 = i; i23 < 64; i23++) {
                Test.iArrFld[i + 1] ^= (int)Test.instanceCount;
                for (i25 = 1; 1 < i25; i25--) {
                    Test.dFld *= i19;
                    Test.iArrFld = Test.iArrFld;
                    i21 = (int)10275L;
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
//DEBUG  bMeth ->  bMeth mainTest
//DEBUG  iMeth ->  iMeth bMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth bMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
