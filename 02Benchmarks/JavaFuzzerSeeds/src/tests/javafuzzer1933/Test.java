package tests.javafuzzer1933;
import utils.FuzzerUtils;
// Generated by Java* Fuzzer test generator (1.0.001). Thu Aug 31 06:17:05 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=8L;
    public volatile int iFld=34572;
    public float fFld=119.156F;
    public static int iArrFld[]=new int[N];
    public long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 5);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i3, int i4) {

        float f=2.203F;
        int i5=24330, i6=-6109, i7=56514, i8=30838, iArr1[]=new int[N];
        double d2=39.47675;
        byte by1=77;

        FuzzerUtils.init(iArr1, 12393);

        iArr1 = FuzzerUtils.int1array(N, (int)-12);
        f = i3;
        for (i5 = 16; i5 < 319; i5++) {
            iArr1 = iArr1;
            i7 = 1;
            do {
                for (d2 = 1; d2 < 1; ++d2) {
                    f *= i5;
                    Test.instanceCount = -45;
                    i4 += (int)d2;
                    by1 *= (byte)i8;
                    Test.instanceCount += (long)d2;
                    try {
                        i3 = (i5 % i4);
                        i6 = (-382028600 % i3);
                        i3 = (i3 / -33329);
                    } catch (ArithmeticException a_e) {}
                    i8 <<= i3;
                    i8 += i8;
                }
                i4 = i8;
            } while (++i7 < 5);
        }
        vMeth2_check_sum += i3 + i4 + Float.floatToIntBits(f) + i5 + i6 + i7 + Double.doubleToLongBits(d2) + i8 + by1 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1(int i1, int i2) {

        double d1=-42.130025;
        byte by=40;
        short s=27260;
        long l=2452978861L;
        int i9=-191, i10=-3783, i11=26926, i12=6, i13=-1673, i14=60545, i15=81, iArr[]=new int[N];
        boolean b=true;
        float f1=0.168F;

        FuzzerUtils.init(iArr, -3);

        i1 = (int)(iArr[(i1 >>> 1) % N] += (int)(d1 - (i2 - i2)));
        by = (byte)(s * i2);
        vMeth2(i2, i1);
        d1 -= -8;
        l = i2;
        i9 = 1;
        while (++i9 < 205) {
            i1 -= i9;
        }
        iArr[(i2 >>> 1) % N] = i2;
        for (i10 = 2; i10 < 358; i10++) {
            if (b) continue;
            for (i12 = 1; i12 < 5; i12++) {
                f1 = i11;
                for (i14 = 1; i14 < 2; i14++) {
                    i13 += (((i14 * i2) + by) - i14);
                    i1 = -106;
                }
            }
        }
        vMeth1_check_sum += i1 + i2 + Double.doubleToLongBits(d1) + by + s + l + i9 + i10 + i11 + (b ? 1 : 0) + i12 +
            i13 + Float.floatToIntBits(f1) + i14 + i15 + FuzzerUtils.checkSum(iArr);
    }

    public void vMeth(int i) {

        boolean b1=false, b2=false;
        float f2=-99.866F;
        int i16=3, i17=14;
        double d3=127.9483;

        if (b1) {
            vMeth1(iFld, -41531);
            vMeth_check_sum += i + (b1 ? 1 : 0) + Float.floatToIntBits(f2) + (b2 ? 1 : 0) + i16 + i17 +
                Double.doubleToLongBits(d3);
            return;
        } else if (b1) {
            iFld = (int)fFld;
        } else {
            Test.iArrFld[(i >>> 1) % N] <<= iFld;
            iFld = i;
            f2 = 1;
            while (++f2 < 269) {
                Test.iArrFld[(int)(f2 - 1)] *= (int)Test.instanceCount;
                fFld = iFld;
                i *= (int)Test.instanceCount;
                b2 = true;
                try {
                    Test.iArrFld[(int)(f2 + 1)] = (159 % iFld);
                    Test.iArrFld[(int)(f2 - 1)] = (i / i);
                    i = (26086 / i);
                } catch (ArithmeticException a_e) {}
                for (i16 = 1; i16 < 6; ++i16) {
                    iFld += (int)d3;
                    fFld %= (Test.instanceCount | 1);
                }
                if (b1) break;
            }
        }
        vMeth_check_sum += i + (b1 ? 1 : 0) + Float.floatToIntBits(f2) + (b2 ? 1 : 0) + i16 + i17 +
            Double.doubleToLongBits(d3);
    }

    public void mainTest(String[] strArr1) {

        double d=89.70129;
        float fArr[][]=new float[N][N];

        FuzzerUtils.init(fArr, -49.838F);

        d = 1;
        do {
            fArr[(int)(d)][(int)(d - 1)] -= (iFld--);
        } while ((d += 3) < 166);
        vMeth(iFld);
        lArrFld[(-5 >>> 1) % N] *= Test.instanceCount;

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
