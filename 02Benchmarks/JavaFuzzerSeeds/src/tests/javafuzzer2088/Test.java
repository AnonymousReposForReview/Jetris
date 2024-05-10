package tests.javafuzzer2088;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 08:53:52 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=11L;
    public volatile int iFld=38233;
    public float fFld=2.721F;
    public static short sFld=-20851;
    public volatile int iFld1=215;
    public int iArrFld[]=new int[N];

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public int iMeth() {

        int i1=40348, i2=64, i3=-44811;
        short s=21187;

        iFld = (int)Test.instanceCount;
        fFld = iFld;
        iFld = iFld;
        iFld -= (int)fFld;
        iFld += (int)fFld;
        i1 = 227;
        do {
            iFld = (int)Test.instanceCount;
            Test.instanceCount = iFld;
            for (i2 = 1; i2 < 7; ++i2) {
                s = (short)i3;
                i3 = i2;
                if (false) continue;
            }
            i3 &= (int)Test.instanceCount;
            iFld += (i1 * i1);
            Test.instanceCount ^= Test.instanceCount;
        } while (--i1 > 0);
        long meth_res = i1 + i2 + i3 + s;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void vMeth1(byte by1) {

        int i4=-14, i5=112, i6=-5;
        long lArr[]=new long[N];
        short sArr[][]=new short[N][N];
        double dArr[][]=new double[N][N];

        FuzzerUtils.init(lArr, -9033215509207543585L);
        FuzzerUtils.init(sArr, (short)-13750);
        FuzzerUtils.init(dArr, -4.74884);

        for (long l1 : lArr) {
            iFld = iMeth();
            sArr[(iFld >>> 1) % N] = sArr[(iFld >>> 1) % N];
            iArrFld[(iFld >>> 1) % N] |= Test.sFld;
            iFld <<= iFld;
            Test.instanceCount += (long)-107.620F;
            iFld -= (int)fFld;
            for (i4 = 1; 4 > i4; i4 += 3) {
                Test.instanceCount += 6207;
                Test.instanceCount *= (long)fFld;
            }
        }
        i6 = 1;
        do {
            i5 *= iFld1;
            iFld1 = -18;
            by1 = (byte)i6;
            dArr = dArr;
        } while (++i6 < 312);
        vMeth1_check_sum += by1 + i4 + i5 + i6 + FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(sArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr));
    }

    public void vMeth(long l, float f, byte by) {

        int i7=174, i8=12, i9=24240, i10=227, i11=-103, i12=-12, i13=79, i14=-14;
        double d1=0.74476;

        vMeth1(by);
        fFld += (float)0.95758;
        for (i7 = 1; i7 < 135; ++i7) {
            for (i9 = 1; i9 < 12; i9++) {
                Test.sFld *= (short)163;
                i10 = (int)l;
            }
            for (i11 = 1; i11 < 12; ++i11) {
                iFld1 -= (int)d1;
                Test.instanceCount = i9;
                for (i13 = 1; 2 > i13; ++i13) {
                    i10 = by;
                    iArrFld[i11 - 1] += 122;
                }
                iFld = (int)l;
                Test.instanceCount <<= l;
                d1 = i8;
            }
        }
        vMeth_check_sum += l + Float.floatToIntBits(f) + by + i7 + i8 + i9 + i10 + i11 + i12 +
            Double.doubleToLongBits(d1) + i13 + i14;
    }

    public void mainTest(String[] strArr1) {

        double d=0.102215, dArr1[]=new double[N];
        int i=32547, i15=-5, i16=2, i17=164, i18=10893, i19=-54440, i20=-91, i21=-11, i22=-13, i23=-45;
        byte by2=-65;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, -844298350L);
        FuzzerUtils.init(dArr1, -26.20753);

        d += (Test.instanceCount - ((i + i) * (i | i)));
        vMeth(-63583L, fFld, by2);
        fFld += i;
        for (i15 = 228; i15 > 1; i15 -= 2) {
            fFld *= fFld;
        }
        i17 = 1;
        while (++i17 < 302) {
            lArr1[i17] = (long)d;
            for (i18 = 3; i18 < 83; ++i18) {
                d -= i;
                i &= (int)Test.instanceCount;
                fFld += Test.instanceCount;
                i19 += i15;
                iArrFld = iArrFld;
            }
            i = (int)fFld;
            Test.instanceCount += (i17 | (long)fFld);
            iArrFld[i17 + 1] *= -56859;
            dArr1[i17 + 1] -= 52798;
            Test.instanceCount += (((i17 * i18) + by2) - Test.sFld);
            lArr1[i17 + 1] = i;
            try {
                i16 = (iFld1 % i);
                iFld = (i16 % iFld1);
                i16 = (-29026 / i15);
            } catch (ArithmeticException a_e) {}
            switch ((i17 % 4) + 104) {
            case 104:
                for (i20 = 2; i20 < 83; i20++) {
                    if (true) break;
                    for (i22 = 1; i22 < 2; ++i22) {
                        i19 += (i22 + Test.sFld);
                        i19 *= i16;
                        iFld1 += i15;
                        d = i20;
                        if (true) break;
                        Test.sFld += (short)fFld;
                    }
                }
                break;
            case 105:
                Test.instanceCount *= Test.instanceCount;
                break;
            case 106:
                i21 += iFld;
                break;
            case 107:
                iFld += i16;
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
//DEBUG  iMeth ->  iMeth vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}