package tests.javafuzzer424;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Wed Aug 30 03:33:29 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-6L;
    public boolean bFld=true;
    public static int iFld=66;
    public short sFld=-26838;
    public static int iArrFld[]=new int[N];
    public byte byArrFld[][]=new byte[N][N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -51672);
    }

    public static long iMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long sMeth_check_sum = 0;

    public static short sMeth(int i1, int i2) {

        int i4=0, i5=-11, i6=12, i7=249, i8=-4;
        float f=0.158F;
        boolean b=true;

        for (int i3 : Test.iArrFld) {
            if (false) {
                i4 = i1;
            }
            Test.instanceCount -= i4;
            i5 = 4;
            do {
                Test.instanceCount += (i5 + i1);
                Test.instanceCount += (-17385 + (i5 * i5));
                f = i2;
            } while ((i5 -= 3) > 0);
            Test.instanceCount = i1;
            i6 >>= i1;
            for (i7 = 4; 1 < i7; --i7) {
                if (b) {
                    i1 *= i5;
                    Test.iArrFld[i7 + 1] %= (int)(i6 | 1);
                    if (i1 != 0) {
                    }
                } else {
                    i4 = -11;
                }
            }
        }
        long meth_res = i1 + i2 + i4 + i5 + Float.floatToIntBits(f) + i6 + i7 + i8 + (b ? 1 : 0);
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public static void vMeth() {

        int i=47, i9=2, i10=243;
        float f1=89.122F;
        double d=40.78443;

        i = sMeth(i, i);
        i9 = 1;
        do {
            Test.instanceCount -= (long)f1;
            i <<= i;
            Test.instanceCount -= i9;
            f1 = i9;
            i <<= i10;
            f1 = -165;
            d *= i;
        } while (++i9 < 152);
        i10 += i10;
        vMeth_check_sum += i + i9 + Float.floatToIntBits(f1) + i10 + Double.doubleToLongBits(d);
    }

    public static int iMeth(long l, long l1) {

        int i11=78;

        vMeth();
        i11 = 141;
        long meth_res = l + l1 + i11;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i12=-4, i13=231, i14=-84, i15=207, i16=50, i17=-107, i18=-95, i19=64245;
        long l2=1L, lArr[]=new long[N];
        float f2=6.696F;
        short sArr[]=new short[N];

        FuzzerUtils.init(lArr, 2442819583L);
        FuzzerUtils.init(sArr, (short)-19574);

        iMeth(Test.instanceCount, Test.instanceCount);
        i12 = 1;
        while ((i12 += 2) < 279) {
            for (i13 = 3; 180 > i13; ++i13) {
                i14 += (i13 ^ i14);
            }
            i14 += i12;
            lArr[i12] >>>= i14;
            if (bFld) break;
            for (i15 = 9; 180 > i15; i15++) {
                byArrFld[i12 + 1][i12] += (byte)-39832;
                i14 = (int)Test.instanceCount;
                for (i17 = 1; i17 < 2; i17 += 2) {
                    i16 >>= (int)Test.instanceCount;
                    Test.instanceCount += (i17 | Test.instanceCount);
                    i14 -= (int)Test.instanceCount;
                    i18 += (int)(-19.85F + (i17 * i17));
                    i16 = i15;
                }
                i14 = -218;
                switch ((i15 % 9) + 27) {
                case 27:
                    Test.iArrFld[(i15 >>> 1) % N] = i18;
                    i19 = 1;
                    while (++i19 < 2) {
                        if (bFld) break;
                        Test.instanceCount *= 40384;
                        i16 += (i19 * Test.instanceCount);
                        i18 += (int)l2;
                        Test.iFld += (int)l2;
                        f2 = Test.instanceCount;
                    }
                    i16 -= i13;
                    if (bFld) continue;
                    break;
                case 28:
                    i16 = i14;
                    dArrFld = dArrFld;
                case 29:
                case 30:
                    i16 += i15;
                    break;
                case 31:
                    Test.instanceCount <<= sFld;
                case 32:
                    sArr = sArr;
                    break;
                case 33:
                    bFld = bFld;
                    break;
                case 34:
                    l2 -= l2;
                    break;
                case 35:
                    Test.instanceCount -= Test.instanceCount;
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  vMeth ->  vMeth iMeth mainTest
//DEBUG  sMeth ->  sMeth vMeth iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
