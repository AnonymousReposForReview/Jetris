package tests.javafuzzer1918;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 05:52:49 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-1L;
    public static float fFld=-34.894F;
    public volatile byte byFld=115;
    public static double dFld=-100.122828;
    public volatile short sFld=-567;
    public boolean bFld=false;
    public static int iArrFld[]=new int[N];
    public static boolean bArrFld[]=new boolean[N];
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 190);
        FuzzerUtils.init(Test.bArrFld, true);
        FuzzerUtils.init(Test.lArrFld, -42932L);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth() {

        int i2=-61497, i3=48049, i4=-18275, i5=125, i6=-83, i7=-5, i8=-2, i9=-33265, iArr1[]=new int[N];
        boolean b=false;
        byte by=67;

        FuzzerUtils.init(iArr1, 63816);

        i2 = -69;
        for (i3 = 7; i3 < 303; ++i3) {
            i4 = i2;
            Test.instanceCount = -12L;
            for (i5 = 1; i5 < 6; i5++) {
                i4 += (5 + (i5 * i5));
            }
            b = b;
            i7 = 1;
            do {
                for (i8 = 1; 1 > i8; i8++) {
                    if (i4 != 0) {
                    }
                    i4 |= 22744;
                    i9 += i6;
                    Test.fFld += i8;
                }
                i2 <<= by;
                iArr1[i3 - 1] = i2;
            } while (++i7 < 6);
        }
        long meth_res = i2 + i3 + i4 + i5 + i6 + (b ? 1 : 0) + i7 + i8 + i9 + by + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public void vMeth1(int i1) {

        int i10=-6536, i11=-7, i12=172, i13=-14, iArr[]=new int[N];
        boolean b1=true;
        double d=-2.98407;
        long lArr[]=new long[N];

        FuzzerUtils.init(iArr, 73);
        FuzzerUtils.init(lArr, 55106L);

        i1 <<= (int)(((i1 + -1.379F) * (3033 - (i1 - i1))) + (iArr[(i1 >>> 1) % N]++));
        i1 = (int)(fMeth() - i1);
        i1 = i1;
        Test.instanceCount -= i1;
        for (i10 = 2; i10 < 301; i10++) {
            i11 *= i10;
            lArr[i10 + 1] += 13;
            i12 = 1;
            do {
                if (b1) continue;
                i1 = i10;
                i13 = 1;
                while (++i13 < 1) {
                    d -= Test.instanceCount;
                    i1 += (i13 + i13);
                    Test.fFld -= Test.instanceCount;
                    if (true) continue;
                }
            } while (++i12 < 6);
        }
        vMeth1_check_sum += i1 + i10 + i11 + i12 + (b1 ? 1 : 0) + i13 + Double.doubleToLongBits(d) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public void vMeth(float f, int i, float f1) {

        boolean b2=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, 2.44263);

        vMeth1(i);
        i >>= 8;
        Test.iArrFld[(-11 >>> 1) % N] *= i;
        f -= 7;
        i -= i;
        dArr[(i >>> 1) % N] = 92.817F;
        f1 = f1;
        i = i;
        Test.bArrFld[(i >>> 1) % N] = b2;
        vMeth_check_sum += Float.floatToIntBits(f) + i + Float.floatToIntBits(f1) + (b2 ? 1 : 0) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void mainTest(String[] strArr1) {

        int i14=8, i15=-5, i16=-2, i17=56, i18=-12, i19=11, i20=-60284, i21=42260, i22=7, i23=-3, i24=11;
        float fArr[]=new float[N];

        FuzzerUtils.init(fArr, -121.908F);

        vMeth(Test.fFld, i14, Test.fFld);
        byFld += (byte)i14;
        Test.instanceCount = (long)Test.dFld;
        for (i15 = 180; i15 > 3; --i15) {
            for (i17 = 1; i17 < 142; i17++) {
                i16 = (int)Test.fFld;
                i18 += (int)Test.dFld;
                Test.instanceCount >>>= i16;
                i19 = 1;
                do {
                    Test.instanceCount += (((i19 * Test.fFld) + i17) - i17);
                } while (++i19 < 2);
            }
            i16 = i16;
            i14 = i14;
        }
        for (i20 = 6; i20 < 202; i20++) {
            sFld *= (short)i17;
            Test.fFld += Test.instanceCount;
            i14 -= (int)Test.fFld;
            i22 = 1;
            do {
                sFld -= (short)-1;
                i16 |= (int)Test.instanceCount;
                Test.fFld %= (Test.instanceCount | 1);
                Test.fFld = (float)Test.dFld;
            } while (++i22 < 128);
            switch ((i20 % 2) + 111) {
            case 111:
                Test.dFld += Test.instanceCount;
                Test.iArrFld[i20] += (int)12751L;
                switch (((i21 >>> 1) % 3) + 119) {
                case 119:
                    for (i23 = 3; i23 < 128; i23++) {
                        i18 -= i19;
                    }
                    if (bFld) break;
                    i14 += (int)Test.instanceCount;
                    i14 *= i20;
                    break;
                case 120:
                    i16 += (((i20 * i16) + Test.instanceCount) - i24);
                    break;
                case 121:
                    i16 += (i20 * i20);
                default:
                    fArr[i20] -= (float)Test.dFld;
                }
            case 112:
                Test.lArrFld[i20] += (long)Test.fFld;
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  fMeth ->  fMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}