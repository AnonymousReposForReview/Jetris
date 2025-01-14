package tests.javafuzzer1995;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 07:00:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-8L;
    public static volatile byte byFld=69;
    public static volatile int iFld=-52078;
    public static int iFld1=55344;
    public int iFld2=-2;
    public long lArrFld[]=new long[N];
    public static long lArrFld1[]=new long[N];
    public static boolean bArrFld[][]=new boolean[N][N];
    public float fArrFld[]=new float[N];

    static {
        FuzzerUtils.init(Test.lArrFld1, -3290335638L);
        FuzzerUtils.init(Test.bArrFld, false);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i7=22598, i8=3, i9=28544, i10=59787, iArr[]=new int[N];
        double d2=2.20536;
        float f2=2.181F;
        boolean b=true;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-10038);
        FuzzerUtils.init(iArr, -42536);

        i7 = 181;
        do {
            Test.iFld += i7;
            Test.iFld >>>= Test.iFld;
            Test.iFld = i7;
            Test.instanceCount = Test.iFld;
            d2 += Test.instanceCount;
            for (f2 = 1; 25 > f2; ++f2) {
                for (i9 = 1; i9 < 2; i9++) {
                    if (b) continue;
                    i10 *= i8;
                    Test.iFld = i7;
                    Test.byFld += (byte)i9;
                    Test.byFld -= (byte)Test.instanceCount;
                }
                Test.lArrFld1[(int)(f2 + 1)] += Test.instanceCount;
                iArr[(int)(f2 + 1)] = (int)f2;
            }
        } while ((i7 -= 3) > 0);
        long meth_res = i7 + Double.doubleToLongBits(d2) + Float.floatToIntBits(f2) + i8 + i9 + i10 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth1(double d1, int i4, int i5) {

        int i6=-5, i11=-4, i12=-14502, i13=0;
        float f3=-1.586F;
        boolean b1=false;
        double dArr[]=new double[N];

        FuzzerUtils.init(dArr, -88.54932);

        i6 = 1;
        while (++i6 < 127) {
            Test.instanceCount += (iMeth() / -12);
            Test.instanceCount = -3;
            for (f3 = 1; f3 < 12; f3++) {
                for (i12 = 1; i12 < 2; i12++) {
                    i13 *= (int)d1;
                    Test.iFld >>>= i13;
                    Test.iFld = i12;
                    b1 = false;
                    b1 = b1;
                }
            }
            dArr[i6] = i12;
            i11 <<= i13;
            if (b1) break;
            i11 += (i6 ^ i6);
        }
        d1 += -17033;
        vMeth1_check_sum += Double.doubleToLongBits(d1) + i4 + i5 + i6 + Float.floatToIntBits(f3) + i11 + i12 + i13 +
            (b1 ? 1 : 0) + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public static void vMeth(int i2, int i3) {

        float f1=7.824F;
        short s2=25879;
        int i14=12, i15=-549, i16=-35625, i17=-210, i18=9630, iArr1[]=new int[N];
        long l=-4125698708L;
        boolean b2=false;
        double d3=101.4545;

        FuzzerUtils.init(iArr1, 50837);

        i3 = (~i2);
        f1 -= ((f1 + (i3 + i2)) - (Math.max(i3, i2) + i2));
        vMeth1(114.18556, Test.iFld, -79);
        i2 -= s2;
        for (i14 = 229; i14 > 6; i14 -= 2) {
            for (l = 1; 14 > l; ++l) {
                i3 = i14;
                i3 += (int)l;
                Test.instanceCount *= Test.instanceCount;
                Test.bArrFld[(int)(l + 1)] = Test.bArrFld[(i16 >>> 1) % N];
            }
            Test.instanceCount <<= i16;
            for (i17 = 1; i17 < 14; ++i17) {
                b2 = b2;
                iArr1[i17] = i3;
            }
            d3 %= ((long)(f1) | 1);
        }
        vMeth_check_sum += i2 + i3 + Float.floatToIntBits(f1) + s2 + i14 + i15 + l + i16 + i17 + i18 + (b2 ? 1 : 0) +
            Double.doubleToLongBits(d3) + FuzzerUtils.checkSum(iArr1);
    }

    public void mainTest(String[] strArr1) {

        double d=0.125184, dArr1[]=new double[N];
        int i=2, i1=-15627, i19=-12, i20=0, i21=-24059, i22=-4, iArr2[]=new int[N];
        short s=31938;
        float f=1.884F;
        boolean b3=false;
        long l1=-9L;

        FuzzerUtils.init(iArr2, 22364);
        FuzzerUtils.init(dArr1, 33.73544);

        d = 1;
        do {
            for (i = 1; i < 76; ++i) {
                lArrFld[(int)(d - 1)] = (long)13.68886;
                Test.instanceCount += (i ^ s);
                Test.instanceCount -= Math.max((int)((i1 - 6L) - i), (int)((i1 - i) + (Test.byFld - f)));
                vMeth(Test.iFld, i1);
            }
            i19 = 1;
            while (++i19 < 76) {
                for (i20 = 1; i20 < 1; ++i20) {
                    f += -125;
                    i21 += i20;
                }
                Test.iFld = i;
                Test.instanceCount *= i21;
                f += (i19 - Test.iFld);
                iArr2[i19 - 1] += (int)Test.instanceCount;
                Test.instanceCount <<= Test.instanceCount;
                dArr1[(int)(d + 1)] += Test.instanceCount;
                Test.iFld <<= i;
                fArrFld[(Test.iFld1 >>> 1) % N] -= Test.instanceCount;
            }
            i1 += (int)(d - f);
            Test.iFld1 += 8534;
            iFld2 <<= i21;
            switch ((int)((d % 7) + 72)) {
            case 72:
                if (b3) break;
                Test.iFld1 *= i1;
                lArrFld[(int)(d - 1)] *= i19;
                break;
            case 73:
                Test.instanceCount -= iFld2;
                Test.instanceCount = Test.instanceCount;
                for (l1 = 2; l1 < 76; ++l1) {
                    dArr1[(int)(d)] -= -16202;
                    iFld2 ^= (int)l1;
                }
                break;
            case 74:
                if (b3) continue;
                break;
            case 75:
            case 76:
                s = (short)i;
                break;
            case 77:
                Test.instanceCount = -12;
                break;
            case 78:
                dArr1[(int)(d)] = i20;
                break;
            }
        } while (++d < 331);


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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
